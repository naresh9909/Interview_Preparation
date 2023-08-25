package ReadData;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class csvReaderClass {
	
	public String[][] csvReader(String FileName, int row, int col) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.dir")+"/src/ReadData/numbers.csv"));
		String line = "";
		String splitBy = ",";
		String[][] csvData = new String[row][col];
		int actualRow =0;
		while (((line = br.readLine())!=null)&& (line.split(splitBy).length==col)) {
			//System.out.println("  "+actualRow+"  ");
			String[] RowData = line.split(splitBy);
			System.out.println(RowData.length);
			for(int i=0;i<RowData.length;i++) {
				System.out.println(actualRow+"   "+i+"   "+RowData[i]);

				csvData[actualRow][i]= RowData[i];
			}
			
			actualRow =actualRow+1;
		} 
		System.out.println("====================");
		return csvData;
		
	}

}
