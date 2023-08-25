package ReadData;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class textReader {
	
	public String[][] textReader(String FileName, int row, int col) throws IOException{
		
		BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.dir")+"/src/ReadData/textfile.txt"));
	String line = null;
	
	while((line = br.readLine())!=null  && (line.split(",").length == col)){
		String[] rowData = line.split(",");
		for(int i=0;i<rowData.length;i++) {
			System.out.print(rowData[i]);
		}
		System.out.println();
		
	};
		return null;
	}

}
