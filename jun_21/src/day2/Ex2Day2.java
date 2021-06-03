package day2;

public class Ex2Day2 {

	public static void main(String[] args) {
		int[][] arr2D = new int[10][10];
		for(int i = 0; i < arr2D.length; i++) {
			for(int j = 0; j < arr2D[0].length; j++) {
				arr2D[i][j] = (int) (Math.random() * 100);
				System.out.print(arr2D[i][j] + ", ");
			}
			System.out.println();
		}
		int max = 0, xPos = 0, yPos = 0;
		for(int i = 0; i < arr2D.length; i++) {
			for(int j = 0; j < arr2D[0].length; j++) {
				if(max < arr2D[i][j]) {
					max = arr2D[i][j];
					xPos = j;
					yPos = i;
				}
			}
		}
		System.out.println("max num is " + max + " at position " + xPos + "," + yPos);
	}

}
