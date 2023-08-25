package ReadData;

import java.io.IOException;

public class csvRunner {

	public static void main(String[] args) throws IOException {
		csvReaderClass brc = new csvReaderClass();
		String[][] csvData = brc.csvReader("", 5, 2);
        for(int i=0;i<5;i++) {
        	for(int j=0;j< 2;j++) {
        		System.out.println(csvData[i][j]);
        	}
        }
        System.out.println("------------------");
		
	}

}
