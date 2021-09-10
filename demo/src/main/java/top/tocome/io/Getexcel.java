package top.tocome.io;



import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class Getexcel {
//    public static void parseInfoFromInputFile(String inputFilePath, int rowBegin) throws IOException {
//        FileInputStream fileInput = new FileInputStream(inputFilePath);//创建文件输入流
//        XSSFWorkbook wb = new XSSFWorkbook(fileInput);//由输入流文件得到工作簿对象
//        XSSFSheet sheet = wb.getSheetAt(0);//获取第一个sheet
//        int lastRowNum = sheet.getLastRowNum(); //获取表格内容的最后一行的行数
//
//        //rowBegin代表要开始读取的行号，下面这个循环的作用是读取每一行内容
//        for (int i = rowBegin; i <= lastRowNum; ++i) {
//            XSSFRow row = sheet.getRow(i);//获取每一行
//            int columnNum = row.getLastCellNum();//获取每一行的最后一列的列号，即总列数
//            for (int j=0; j<columnNum; ++j) {
//                XSSFCell cell = row.getCell(j);//获取每个单元格
//                cell.setCellType(CellType.STRING);
////                if (j == 0) { //对第一列日期进行特殊处理
////                    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
////                    System.out.printf("%s\t", format.format(cell.getDateCellValue()));
////                } else if (CellType.NUMERIC.equals(cell.getCellType())) {
////                    System.out.printf("%.0f\t", cell.getNumericCellValue());
////                } else {
//                    System.out.printf("%s\t", cell.getStringCellValue());
//
//            }
//            System.out.println();
//        }
//        wb.close();
//        fileInput.close();
//    }
}
