package selecao;

public class ExemploString1 {
	
	public static void main(String[] args) {
		
		String texto = "rodrigo curvello";
		
		System.out.println("Maiúsculo: " + texto.toUpperCase());
		System.out.println("Minúsculo: " + texto.toLowerCase());
		System.out.println("Parte do texto: " + texto.substring(0,5));
		System.out.println("Trocando letras: " + texto.replaceAll("o", "@"));
		System.out.println("Letra na posição: " + texto.charAt(8));
		System.out.println("Tamanho: " + texto.length());

	}

}
