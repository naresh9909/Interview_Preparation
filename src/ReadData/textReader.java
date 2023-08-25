package ReadData;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class textReader {

	public String[][] textReader(String FileName, int row, int col) throws IOException {

		BufferedReader br = new BufferedReader(
				new FileReader(System.getProperty("user.dir") + "/src/ReadData/"+FileName+".txt"));
		String line = null;
		int actualRow = 0;
		String[][] textData = new String[row][col];
		while ((line = br.readLine()) != null && (line.split(",").length == col)) {
			String[] rowData = line.split(",");
			for (int i = 0; i < rowData.length; i++) {
				System.out.print(rowData[i]);
				textData[actualRow][i] = rowData[i];
			}
			System.out.println();
			actualRow = actualRow + 1;

		}
		return textData;
	}

}
