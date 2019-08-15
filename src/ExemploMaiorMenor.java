import java.util.Scanner;

public class ExemploMaiorMenor {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[] vetNum = new int[10];
		int maior = 0, menor = 0;
		
		for (int x = 0; x < 5; x++){
			System.out.print(">");
			vetNum[x] = entrada.nextInt();
			if (x == 0){
				maior = vetNum[x];
				menor = vetNum[x];
			}
			else{
				if (maior < vetNum[x]){
					maior = vetNum[x];
				}
				if (menor > vetNum[x]){
					menor = vetNum[x];
				}
			}
		}
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
	}
}