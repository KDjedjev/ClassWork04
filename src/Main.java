import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int matrix[][] = new int[4][4];
		int c = 1;
		for (int j = 0; j < matrix.length; j++) {
			for (int i = 0; i < matrix.length; i++) {
				matrix[i][j] = c++;
			}
		}
		for (int j = 0; j < matrix.length; j++) {
			for (int i = 0; i < matrix[j].length; i++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		for (int j = 0; j < matrix.length; j++) {
			for (int i = 0; i < matrix[j].length; i++) {
				if (matrix[i][j] % 2 != 0) {
					matrix[i][j] *= 2;
				}
			}
		}
		for (int j = 0; j < matrix.length; j++) {
			for (int i = 0; i < matrix[j].length; i++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
