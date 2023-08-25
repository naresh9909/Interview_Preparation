package ReadData;

import java.io.IOException;

public class textRunner {

	public static void main(String[] args) throws IOException {
		textReader tr = new textReader();
		String[][] txtData = tr.textReader("textfile", 5, 2);
		for(int i=0;i<5;i++) {
			for(int j=0;j<2;j++) {
				System.out.println(txtData[i][j]);
			}
		}

	}

}
