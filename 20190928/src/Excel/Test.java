package Excel;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Test {
	public static void main(String[] args) throws BiffException, IOException {
		File fname = new File("excel.xls");
		Workbook wb = Workbook.getWorkbook(fname);
		Sheet sh = wb.getSheet(0);
		Cell c = sh.getCell(0,0 );
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < sh.getRows(); j++) {
				System.out.print(sh.getCell(j,i).getContents()+" ");
			}
			System.out.println();
		}
	}
}
