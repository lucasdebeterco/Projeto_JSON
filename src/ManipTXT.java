import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Vector;

public class ManipTXT {
	
	private String nomeDoArquivo = "semnome.txt";
	private Formatter output = null;
	
	public ManipTXT(String nomeDoArquivo){
		setNomeDoArquivo(nomeDoArquivo);
	}

	public boolean abrirArquivo(){
		try {
			output = new Formatter(new File(nomeDoArquivo));
			return true;
		} catch (SecurityException se) {
			System.out.println("Voce nao tem permissao para gravar este arquivo - ");
			System.out.print(se);
			System.exit(1);
		}
		catch(FileNotFoundException fnf){
			System.out.println("Erro ao criar arquivo - ");
			System.out.print(fnf);
			System.exit(1);
		}
		return false;
	}
	
	public void escrever(String texto){
		try {
			output.format(texto+"\n");
		} catch (Exception e) {
			System.out.println("ERRO: " + e.toString());
		}
	}
	
	public void fecharArquivo(){
		try {
			output.close();
		} catch (Exception e) {
			System.out.println("ERRO: " + e.toString());
		}
		
	}
	
	public Vector<String> ler(){
		Scanner input = null;
		Vector<String> vetor = new Vector<String>();
		try {
			input = new Scanner(new File(nomeDoArquivo));
		} catch (SecurityException se) {
			System.out.println("Voce nao tem permissao para abrir este arquivo - ");
			System.out.print(se);
			System.exit(1);
		}
		catch(FileNotFoundException fnf){
			System.out.println("Erro ao abrir arquivo - ");
			System.out.print(fnf);
			System.exit(1);
		}
		try{
			while(input.hasNext())
				vetor.add(input.nextLine());
		}catch(NoSuchElementException nsee){
			System.out.println("Arquivo esta mal formatado. - ");
			System.out.print(nsee);
			input.close();
			System.exit(0);
		}catch(IllegalStateException ise){
			System.out.println("Erro ao ler arquivo. - ");
			System.out.print(ise);
			System.exit(0);
		}
		if (input != null){
			input.close();
		}
		return vetor;
	}
	
	public void limparArquivo(){
		abrirArquivo();
	}

	public String getNomeDoArquivo() {
		return nomeDoArquivo;
	}

	public void setNomeDoArquivo(String nomeDoArquivo) {
		this.nomeDoArquivo = nomeDoArquivo;
	}

}