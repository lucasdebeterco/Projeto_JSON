package selecao;

public class ExemploIF1 {

	public static void main(String[] args) {

		int num = 10;
		
		if ((num >= 0) && (num <= 10))
			System.out.println("1");
		else{
			if ((num == 100) || (num == 300))
				System.out.println("2");
			
		}
	}

}
