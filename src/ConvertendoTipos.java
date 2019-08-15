import java.util.Scanner;


public class ConvertendoTipos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
	   	 * Criando o objeto Scanner responsável pela leitura do teclado
	   	 */
	   	Scanner entrada = new Scanner(System.in);
    	
    	// Enviando mensagem na tela solicitando a digitação de um Inteiro
    	System.out.print("Informe um número inteiro: ");
    	/**
    	 * Lendo um valor inteiro
    	 */
    	int numeroInteiro =  entrada.nextInt();

		// Enviando mensagem na tela solicitando a digitação de um Float
		System.out.print("Informe um número float: ");
    	/**
    	 * Lendo um valor float
    	 */
    	float numeroFloat =  entrada.nextFloat();
    	
    	// Limpando Buffer de teclado para leitura de texto
    	entrada.nextLine();
    	// Enviando mensagem na tela solicitando a digitação de um Texto
    	System.out.print("Informe um texto: ");
    	/**
    	 * Lendo um texto
    	 */
    	String texto =  entrada.nextLine();
    	
    	// Enviando mensagem na tela solicitando a digitação de um Double
    	System.out.print("Informe um número double: ");
    	/**
    	 * Lendo um valor double
    	 */
    	double numeroDouble =  entrada.nextDouble();
    	
    	// Limpando Buffer de teclado para leitura de caracter
    	entrada.nextLine();
    	// Enviando mensagem na tela solicitando a digitação de um Caracter
    	System.out.print("Informe um caracter: ");
    	/**
    	 * Lendo um caracter
    	 */
    	char caracter =  entrada.nextLine().charAt(0);
    	
    	// Enviando mensagem na tela solicitando a digitação de um Boolean
    	System.out.print("Informe um boolean: ");
    	/**
    	 * Lendo um valor booleano
    	 */
    	boolean VouF =  entrada.nextBoolean();
    	
    	/**
    	 * Mostrando a saida de dados
    	 */
    	System.out.println("\n\n####### Todos os Dados Convertidos para Inteiro #######");
    	System.out.println("Inteiro: " + numeroInteiro);
    	System.out.println("Float: " + (int)numeroFloat);
    	System.out.println("Texto: " + Integer.parseInt(texto));
    	System.out.println("Double: " + (int)numeroDouble);
    	System.out.println("Caracter: " + Integer.parseInt(caracter+""));
    	System.out.println("Boolean: " + (int)(VouF?1:0));
    	
    	System.out.println("\n\n####### Todos os Dados Convertidos para Float #######");
    	System.out.println("Inteiro: " + (float)numeroInteiro);
    	System.out.println("Float: " + numeroFloat);
    	System.out.println("Texto: " + Float.parseFloat(texto));
    	System.out.println("Double: " + (float)numeroDouble);
    	System.out.println("Caracter: " + Float.parseFloat(caracter+""));
    	System.out.println("Boolean: " + (float)(VouF?1:0));
    	
    	System.out.println("\n\n####### Todos os Dados Convertidos para Double #######");
    	System.out.println("Inteiro: " + (double)numeroInteiro);
    	System.out.println("Float: " + (double)numeroFloat);
    	System.out.println("Texto: " + Double.parseDouble(texto));
    	System.out.println("Double: " + numeroDouble);
    	System.out.println("Caracter: " + Double.parseDouble(caracter+""));
    	System.out.println("Boolean: " + (double)(VouF?1:0));
    	
    	System.out.println("\n\n####### Todos os Dados Convertidos para String #######");
    	System.out.println("Inteiro: " + String.valueOf(numeroInteiro));
    	System.out.println("Float: " + String.valueOf(numeroFloat));
    	System.out.println("Texto: " + texto);
    	System.out.println("Double: " + String.valueOf(numeroDouble));
    	System.out.println("Caracter: " + (caracter+""));
    	System.out.println("Boolean: " + String.valueOf(VouF));
	}

}
