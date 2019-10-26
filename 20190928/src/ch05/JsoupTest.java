package ch05;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class JsoupTest {
	public static void main(String[] args) throws IOException {
		Document doc = Jsoup.connect("https://movie.naver.com/movie/point/af/list.nhn?st=mcode&sword=167613&target=after").get();
		Elements contents = doc.select("tbody tr td.title");
		for(int i =0;i<contents.size();i++) {
			Element e = contents.get(i);
			String text = e.ownText();
			//String no = text.substring(0,10);
			System.out.println(text);
		}
	}
}
