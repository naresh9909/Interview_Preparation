package Arrays;

public class OneDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cars = { "Honda", "Totyota", "BMW", "BENZ", "AUDI" };
		int[] numbers = new int[5];
		numbers [0] = 0;
		numbers [1] = 1;
		numbers [2] = 2;
		numbers [3] = 3;
		numbers [4] = 4;
		
		for(int i=0;i< cars.length;i++) {
			System.out.println(cars[i]);
		}
		System.out.println("=============================");
		
		for(int num: numbers) {
			System.out.println(num);
		}

	}

}
