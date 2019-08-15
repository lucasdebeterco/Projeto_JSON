public class CorrecaoProva {
	public static void main(String[] args) {
		int x = 1;
		int s = 0;
		while(x < 2){
			for (int y = 0; y < 30; y = y + 2){
				for (int z = 0; z < 10; z = z + 3){
					if ((z % 2 == 0) && (y % 3 == 0)){
						s = (y * 3 + z) / (z + 1);
						if (s > 18)
							System.out.println(y + " : " + s + " : " + (y - s));
					}
				}
			}
			x++;
		}	
	}
}