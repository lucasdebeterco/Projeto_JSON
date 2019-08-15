
import java.util.Random;

//import java.util.Scanner;

public class exe6 {

	public static void main(String[] args) {
		//Scanner input = new Scanner(System.in); Coloquei o scanner pois tinha input, 
												//mas tirei para fazer os testes.
		
		final float TAM = 10, NUM_NOTAS = 4;
		float media_1 = 0, media_2 = 0, media_3 = 0, media_4 = 0, media_5 = 0, media_6 = 0;
		float media_7 = 0, media_8 = 0, media_9 = 0, media_10 = 0;
		float[] media1 = new float [(int) TAM];
		float[] media2 = new float [(int) TAM];
		float[] media3 = new float [(int) TAM];
		float[] media4 = new float [(int) TAM];
		
		Random generator = new Random();
		for(float x = 0; x < TAM; x++){
			media1[(int) x] = generator.nextInt(11);  
			
			media2[(int) x] = generator.nextInt(11);
			
			media3[(int) x] = generator.nextInt(11); 
			
			media4[(int) x] = generator.nextInt(11); 
			
			media_1 = (media1[0] + media2[0] + media3[0] + media4[0]) / NUM_NOTAS;
			media_2 = (media1[1] + media2[1] + media3[1] + media4[1]) / NUM_NOTAS;
			media_3 = (media1[2] + media2[2] + media3[2] + media4[2])/ NUM_NOTAS;
			media_4 = (media1[3] + media2[3] + media3[3] + media4[3]) / NUM_NOTAS;
			media_5 = (media1[4] + media2[4] + media3[4] + media4[4]) / NUM_NOTAS;
			media_6 = (media1[5] + media2[5] + media3[5] + media4[5]) / NUM_NOTAS;
			media_7 = (media1[6] + media2[6] + media3[6] + media4[6]) / NUM_NOTAS;
			media_8 = (media1[7] + media2[7] + media3[7] + media4[7]) / NUM_NOTAS;
			media_9 = (media1[8] + media2[8] + media3[8] + media4[8]) / NUM_NOTAS;
			media_10 = (media1[9] + media2[9] + media3[9] + media4[9]) / NUM_NOTAS;
			
		}
		
		float a_media[] = {media_1,media_2,media_3,media_4,media_5,media_6,media_7,media_8,media_9,media_10};
		for(int x = 1; x <= TAM; x++){
			System.out.println("M�dia: " + a_media[x]);
		}
		

	}

}
