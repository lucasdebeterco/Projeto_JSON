package vetorEmatriz;

import java.util.Scanner;

public class Matriz1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		final int LIN = 3;
		final int COL = 3;
		int[][] matriz = new int[LIN][COL];
		
		for (int lin = 0; lin < LIN; lin++){
			for (int col = 0; col < COL; col++){
				System.out.print("["+ lin + "," + col + "] : ");
				matriz[lin][col] = entrada.nextInt();		
			}
		}
		
		for (int lin = 0; lin < LIN; lin++){
			System.out.println();
			for (int col = 0; col < COL; col++)
				System.out.print(matriz[lin][col] + "  ");
		}
		
		
	}
}