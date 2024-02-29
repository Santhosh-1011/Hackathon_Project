package utilities;


	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;

	import org.apache.poi.ss.usermodel.CellStyle;
	import org.apache.poi.ss.usermodel.DataFormatter;
	import org.apache.poi.ss.usermodel.FillPatternType;
	import org.apache.poi.ss.usermodel.IndexedColors;
	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class ExcelUtility {

		public  static FileInputStream fi;
		public static  FileOutputStream fo;
		public static  XSSFWorkbook workbook;
		public  static XSSFSheet sheet;
		public static XSSFRow row;
		public static XSSFCell cell;
		public static CellStyle style;   
		static String path;
		
		
		public static String getCellData(String sheetName,int rownum,int colnum) throws IOException
		{
			fi=new FileInputStream(System.getProperty("user.dir")+"\\testData\\BookShelves.xlsx");
			workbook=new XSSFWorkbook(fi);
			sheet=workbook.getSheet(sheetName);
			row=sheet.getRow(rownum);
			cell=row.getCell(colnum);
			
			DataFormatter formatter = new DataFormatter();
			String data;
			try{
			data = formatter.formatCellValue(cell); //Returns the formatted value of a cell as a String regardless of the cell type.
			}
			catch(Exception e)
			{
				data="";
			}
			workbook.close();
			fi.close();
			return data;
		}
		
		public  static void setCellData(String sheetName,int rownum,int colnum,String data) throws IOException
		{
			 String path=System.getProperty("user.dir")+"\\testData\\BookShelves.xlsx";
			File xlfile=new File(path);
			if(!xlfile.exists())    // If file not exists then create new file
			{
			workbook=new XSSFWorkbook();
			fo=new FileOutputStream(path);
			workbook.write(fo);
			}
					
			fi=new FileInputStream(path);
			workbook=new XSSFWorkbook(fi);
				
			if(workbook.getSheetIndex(sheetName)==-1) // If sheet not exists then create new Sheet
				workbook.createSheet(sheetName);
			sheet=workbook.getSheet(sheetName);
						
			if(sheet.getRow(rownum)==null)   // If row not exists then create new Row
					sheet.createRow(rownum);
			row=sheet.getRow(rownum);
			
			cell=row.createCell(colnum);
			cell.setCellValue(data);
			fo=new FileOutputStream(path);
			workbook.write(fo);		
			workbook.close();
			fi.close();
			fo.close();
		}
		
	}




