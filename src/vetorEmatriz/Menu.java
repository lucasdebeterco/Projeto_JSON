package vetorEmatriz;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int opcao = 0;
		
		do{
			System.out.println(":::... MENU ...:::");
			System.out.println("1 - Inclusão");
			System.out.println("2 - Alteração");
			System.out.println("3 - Exclusão");
			System.out.println("4 - Relatório Geral");
			System.out.println("5 - Consulta por Nome");
			System.out.println("6 - Consulta por Sobrenome");
			System.out.println("7 - Aniversários do mês");
			System.out.println("8 - SAIR");
			System.out.println("Informe a sua opção: ");
			opcao = entrada.nextInt();
			
			String texto = "rodrigo";
			
		
				
			
			switch (opcao) {
			case 1:{System.out.println("1");
					
					}
				break;
			case 2:System.out.println("2");
				break;
			case 3:System.out.println("3");
				break;
			case 4:System.out.println("4");
				break;
			case 5:System.out.println("5");
				break;
			case 6:System.out.println("6");
				break;
			case 7:System.out.println("7");
				break;
			case 8:System.out.println("8");
				break;
			default:System.out.println("Erro!!!!");
				break;
			}
			
		}while(opcao != 8);
		
		
		

	}

}

