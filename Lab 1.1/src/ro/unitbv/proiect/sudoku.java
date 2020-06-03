package ro.unitbv.proiect;

public class sudoku {

	public static boolean isSafe(int[][] board, int row, int col, int num) {

		//numere unuice pe rand
		for (int d = 0; d < board.length; d++) {
			// dacă numărul pe care încercăm
            // sa-l punem este deja prezent pe
            // acel rând, returnează false;
			if (board[row][d] == num) {
				return false;
			}
		}
		//numere unice pe coloana
		for (int r = 0; r < board.length; r++) {
			// dacă numărul pe care încercăm
            // sa-l punem este deja prezent pe
            // acea coloana, returnează false;
			if (board[r][col] == num) {
				return false;
			}
		}
		//pătratul corespunzător are un număr unic
		int sqrt = (int) Math.sqrt(board.length);
		int boxRowStart = row - row % sqrt;
		int boxColStart = col - col % sqrt;
		for (int r = boxRowStart; r < boxRowStart + sqrt; r++) {
			for (int d = boxColStart; d < boxColStart + sqrt; d++) {
				if (board[r][d] == num) {
					return false;
				}
			}
		}
		//daca nu exista conflicte, merge mai departe
		return true;
	}
	public static boolean solveSudoku(int[][] board, int n) {
		int row = -1;
		int col = -1;
		boolean isEmpty = true;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (board[i][j] == 0) {
					row = i;
					col = j;
					
					//mai sunt unele valori lipsa
					isEmpty = false;
					break;
				}
			}
			//nu mai sunt locuri goale
			if (!isEmpty) {
				break;
			}
		}
		//daca sunt locuri necompletate
		//ia fecare rand si face backtrack
		if (isEmpty) {
			return true;
		}
		for (int num = 1; num <= n; num++) {
			if (isSafe(board, row, col, num)) {
				board[row][col] = num;
				if (solveSudoku(board, n)) {
					//afiseaza tabla
					return true;
				} else {
					//o inlocuieste
					board[row][col] = 0;
				}
			}
		}
		return false;
	}
	public static void print(int[][] board, int N) {
		//afiseaza raspunsul
		for (int r = 0; r < N; r++) {
			for (int d = 0; d < N; d++) {
				System.out.print(board[r][d]);
				System.out.print(" ");
			}
			System.out.print("\n");

			if ((r + 1) % (int) Math.sqrt(N) == 0) {
				System.out.print("");
			}
		}
	}
	public static void main(String args[]) {
		int[][] board = new int[][] { 
			{ 5, 3, 0, 0, 7, 0, 0, 0, 0 }, 
			{ 6, 0, 0, 1, 9, 5, 0, 0, 0 },
			{ 0, 9, 8, 0, 0, 0, 0, 6, 0 }, 
			{ 8, 0, 0, 0, 6, 0, 0, 0, 3 }, 
			{ 4, 0, 0, 8, 0, 3, 0, 0, 1 },
			{ 7, 0, 0, 0, 2, 0, 0, 0, 6 }, 
			{ 0, 6, 0, 0, 0, 0, 2, 8, 0 }, 
			{ 0, 0, 0, 4, 1, 9, 0, 0, 5 },
			{ 0, 0, 0, 0, 8, 0, 0, 7, 9 } };
		int N = board.length;
		if (solveSudoku(board, N)) {
			//afiseaza raspunsul
			print(board, N);
		} else {
			System.out.println("No solution");
		}
	}
}
