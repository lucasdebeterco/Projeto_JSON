package vetorEmatriz;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ArrayJson {

	public static void main(String[] args) throws IOException {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de valores: ");
		int t = entrada.nextInt();
		
		int[] vet = new int[t];
		
		for (int i = 0; i < t; i++) {
			System.out.print("->");
			vet[i] = entrada.nextInt();
		}
				
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		FileWriter writer = new FileWriter("arrayjson.json");
		writer.write(gson.toJson(vet));
		writer.close();
		
		String stringJson = gson.toJson(vet);
		
		int[] vetorJson = new int[t]; // Vetor que irá receber os valores
		vetorJson = gson.fromJson(stringJson, vetorJson.getClass());
		
		System.out.println("Imprimindo os valor contidos no arquivo JSON: ");
		for (int i = 0; i < t; i++) {
			System.out.println("Valor " + (i+1) + ": " + vetorJson[i]);
		}
		entrada.close();
	}
}