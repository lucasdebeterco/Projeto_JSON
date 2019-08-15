import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ArquivoWR {
	
	public static void main(String[] args) {
		
		Scanner input = null;
		Formatter output = null;
		int codigo = 0;
		String nome = "";
		String sobreNome = "";
		String email = "";
		try {
			output = new Formatter(new File("agenda.txt"));
		} catch (SecurityException se) {
			System.out.println("Você não tem permissào para gravar este arquivo");
			System.out.println(se);
			System.exit(1);
		}
		catch(FileNotFoundException fnf){
			System.out.println("Erro ao criar arquivo");
			System.exit(1);
		}
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe -1 para o codigo para finalizar.");
		do {
			System.out.print("Informe seu código: ");
			codigo = entrada.nextInt();
			if (codigo == -1){
				System.out.println("O programa será encerrado . . . ");
			}else{
				entrada.nextLine();
				System.out.print("Informe seu nome: ");
				nome = entrada.nextLine();
				System.out.print("Informe seu Sobrenome: ");
				sobreNome = entrada.nextLine();
				System.out.print("Informe seu e-mail: ");
				email = entrada.nextLine();
				output.format("%d %s %s %s\n",codigo,nome,sobreNome,email);
			}
		}while(codigo != -1);
		if (output != null){
			output.close();
		}
		try {
			input = new Scanner(new File("agenda.txt"));
		} catch (SecurityException se) {
			System.out.println("Você não tem permissào para abrir este arquivo");
			System.out.println(se);
			System.exit(1);
		}
		catch(FileNotFoundException fnf){
			System.out.println("Erro ao abrir arquivo");
			System.exit(1);
		}
		System.out.println("## DADOS DA AGENDA ##");
		System.out.println("Código\t\tNome\t\t\tSobrenome\t\tE-mail");
		try{
			while(input.hasNext()){
				codigo = input.nextInt();
				nome = input.next();
				sobreNome = input.next();
				email = input.next();
				System.out.println(codigo+"\t\t\t"+nome+"\t\t\t"+sobreNome+"\t\t"+email)
				;
			}
		}catch(NoSuchElementException nsee){
			System.out.println("Arquivo está mal formatado . . .");
			input.close();
			System.exit(0);
		}catch(IllegalStateException ise){
			System.out.println("Erro ao ler arquivo.");
			System.exit(0);
		}
		if (input != null){
			input.close();
		}		
	}
}