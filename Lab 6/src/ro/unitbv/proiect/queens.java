package ro.unitbv.proiect;
public class queens {
	static int N = 4;
	//ld este un tablou în care indicii săi indică rând-col + N-1(N-1) 
	//este pentru a schimba diferența în a stoca negativ indici
	static int[] ld = new int[30];
	//rd este un tablou în care indicii săi indică rândul + col
	//și verifica dacă poate fi pusă o regină pe
	//diagonala dreapta sau nu
	static int[] rd = new int[30];
	//tablou de coloane unde indicii săi indică coloana și sunt 
	//folosiți pentru a verifica dacă o regină poate fi plasată 
	//în acel rând sau nu
	static int[] cl = new int[30];
	
	//functie pentru afisarea solutiei
	static void printSolution(int board[][]) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				System.out.printf(" %d ", board[i][j]);
			System.out.printf("\n");
		}
	}
	//o funcție recursivă pentru a rezolva problema N Queen
	static boolean solveNQUtil(int board[][], int col) {
		//caz de bază: Dacă toate reginele sunt plasate, 
		//atunci returnează adevărat
		if (col >= N)
			return true;
		//Luați în considerare această coloană și încercați să 
		//plasați regina în toate rândurile unua câte unua
		for (int i = 0; i < N; i++) {
			//Verificați dacă regina poate fi așezată pe tabla la[i][col]
			//Verificați dacă o regină poate fi plasată pe tabla la [row][col]. 
			//Trebuie doar să verificăm ld și rd, 
			//unde ld și rd sunt pentru diagonala stângă și respectiv dreapta

			if ((ld[i - col + N - 1] != 1 && rd[i + col] != 1) && cl[i] != 1) {
				//regina poate fi așezată pe tabla la[i][col]
				board[i][col] = 1;
				ld[i - col + N - 1] = rd[i + col] = cl[i] = 1;
				//reapar pentru a plasa restul reginelor
				if (solveNQUtil(board, col + 1))
					return true;
				//Dacă plasarea reginei pe tabla la [i][col] nu duce la o soluție, 
				//atunci scoateți regina de pe tabala in [i][col]
				board[i][col] = 0;
				ld[i - col + N - 1] = rd[i + col] = cl[i] = 0;
			}
		}
		//Dacă regina nu poate fi plasată în niciun rând în acest coloana col, 
		//atunci întoarce fals
		return false;
	}
	//Aceasta functie foloseste Backtracking pentru rezolvarea problemei.
	//Utilizează în principal solveNQUtil() pentru a rezolva problema. 
	//Returnează fals dacă reginele nu pot fi plasate, in caz contrar,
	//returneaza adevărat. 
	//Aceasta functie afiseaza una din solutiile posibile ale problemei.
	static boolean solveNQ() {
		int board[][] = { 
				{ 0, 0, 0, 0 }, 
				{ 0, 0, 0, 0 }, 
				{ 0, 0, 0, 0 }, 
				{ 0, 0, 0, 0 } };
		if (solveNQUtil(board, 0) == false) {
			System.out.printf("Solution does not exist");
			return false;
		}
		printSolution(board);
		return true;
	}
	public static void main(String[] args) {
		solveNQ();
	}
}
