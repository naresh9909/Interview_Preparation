package ReadData;

import java.io.IOException;

public class excelDataRunner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ExcelData ED = new ExcelData();
		Object[][]readData = ED.excelData("data", 0);
		int Rows = readData.length;
		System.out.println(Rows);
		for(int i=0; i<Rows;i++) {
			System.out.println("Name:" + readData[i][0]+ "      Value: "+readData[i][1]);
			//System.out.println("Name:" + readData[i]);
		}

	}

}
