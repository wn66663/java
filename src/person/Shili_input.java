package person;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Shili_input {

	public static void main(String[] args) throws Exception {
		FileInputStream shilishuju=new FileInputStream("D:\\shili.xlsx");
		XSSFWorkbook sc=new XSSFWorkbook(shilishuju);
		XSSFSheet sheet=sc.getSheet("sheet1");
		int rows_source=sheet.getLastRowNum();
		System.out.println(rows_source);
		Map map=new HashMap<>();
		for (int i = 0; i < rows_source; i++) {
			XSSFRow rowi_source=sheet.getRow(i);
			Iterator<Cell> celljihe_source=rowi_source.cellIterator();
			List list=new ArrayList<>();
			while (celljihe_source.hasNext()) {
				Cell cell_source = (Cell) celljihe_source.next();
				if (cell_source.getCellType()==CellType.STRING) {
					list.add(cell_source.getStringCellValue());
				}else if (cell_source.getCellType()==CellType.NUMERIC) {
					list.add(cell_source.getNumericCellValue());
				}
				
			}
			map.put(list.get(3), list);
		}
		//System.out.println(map);
		FileInputStream shilishuju_dest=new FileInputStream("D:\\18rj2.xlsx");
		XSSFWorkbook sc_dest=new XSSFWorkbook(shilishuju_dest);
		XSSFSheet sheet_dest=sc_dest.getSheet("sheet1");
		int rows_dest=sheet_dest.getLastRowNum();
		for (int i = 0; i < rows_dest; i++) {
			XSSFRow rowi_dest=sheet_dest.getRow(i);
			String xuehao=rowi_dest.getCell(3).getStringCellValue();
			List list_dest=(ArrayList)map.get(xuehao);
			if (list_dest!=null) {
				rowi_dest.createCell(15, CellType.STRING).setCellValue(list_dest.get(11).toString());
				rowi_dest.createCell(16, CellType.STRING).setCellValue(list_dest.get(12).toString());
			}
		}
		FileOutputStream shilishujushuchu_dest=new FileOutputStream("D:\\18rj2.xlsx");
		sc_dest.write(shilishujushuchu_dest);
		shilishujushuchu_dest.close();
	}

}
