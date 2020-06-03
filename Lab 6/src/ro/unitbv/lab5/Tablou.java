package ro.unitbv.lab5;

	import java.util.Arrays;
	import java.util.Random;
	import java.util.Scanner;

	public class Tablou {

			static final int Ax = 3;
			static final int Ay = 3;
			
			private static void matrix(String text, int[][] myTab, int n, int m) {
				System.out.println(String.format("\n%s", text));
				for (int i=0; i<n; i++) {
					for (int j=0; j<m; j++) {
						System.out.print(String.format("%3d ", myTab[i][j]));
					}
						System.out.println();
					}
				}
			
		public static void main(String[] args) {
			try (Scanner myInput = new Scanner (System.in)) {
				int n, m;
				System.out.println("n= ");
				n = myInput.nextInt();
				System.out.println("m= ");
				m = myInput.nextInt();
				System.out.println();
				
				int[][] matrix = new int [n][m];
				
				for (int i=0; i<n; i++) {
					for (int j=0; j<m; j++)
					{
						matrix[i][j] = new Random().nextInt(255);
					}
				}
				matrix(String.format("Original matrix (of size %d x %d) is: ", m, n), matrix, n, m);
				
				//Filtru
				for (int i=0; i<n; i=i+Ay) {
					for (int j=0; j<m; j=j+Ax) {
						int maxAx = Math.min(Ax, m-j);
						int maxAy = Math.min(Ay, n-i);
						int sum = 0;
						for (int k=0; k<maxAy; k++) {
							for (int l=0; l<maxAx; l++) {
								sum += matrix[i+k][j+l];
							}
						}
						int average = (int) sum/(maxAx*maxAy);
						for (int k=0; k<maxAy; k++) {
							for (int l=0; l<maxAx; l++) {
								matrix[i+k][j+l] = average;
							}
						}
					}
				}
				matrix(String.format("Filtered matrix (of size %d x %d) is: ", Ax, Ay), matrix, n, m);
			}

	}
}
