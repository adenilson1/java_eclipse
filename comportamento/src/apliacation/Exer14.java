package apliacation;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		System.out.print("Posicao do elemento = ");
		int elem = sc.nextInt();

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] == elem) {
					System.out.print("Position " + i + "," + j + ":\n");
					if (j > 0) {
						System.out.print("Left: " + mat[i][j - 1] + "\n");
					}
					if (j < mat[i].length - 1) {
						System.out.print("Right: " + mat[i][j + 1] + "\n");
					}
					if (i > 0) {
						System.out.print("Up: " + mat[i - 1][j] + "\n");
					}
					if (i < mat.length - 1) {
						System.out.print("Down: " + mat[i + 1][j] + "\n");

					}
				}

			}
		}

		sc.close();

	}

}
