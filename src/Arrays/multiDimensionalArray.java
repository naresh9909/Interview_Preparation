package Arrays;

public class multiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mt = { { 1, 2, 3 }, { 4, 5, 6, 7, 8, 9 } };
		for (int i = 0; i < mt.length; i++) {
			for (int j = 0; j < mt[i].length; j++) {
				System.out.print(mt[i][j]);
			}
			System.out.println();
		}

		System.out.println("======================");
		mt[0][1] = 99;
		for (int i = 0; i < mt.length; i++) {
			for (int j = 0; j < mt[i].length; j++) {
				System.out.print(mt[i][j]+" ");
			}
			System.out.println();
		}

	}

}
