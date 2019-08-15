import java.util.Scanner;
import java.text.DecimalFormat;
public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner ler = new Scanner (System.in);
    DecimalFormat casas =new DecimalFormat("0,00");
       int n1, n2, nvar, nsoma;
       double nmeio;
       
       n1 = ler.nextInt();
       n2= ler.nextInt();
       
       if ((n1<n2)&&(n2!=n1 +1)&&(n1!=n2)){
    	   //nvar= n2 -n1;
    	   //nsoma=nvar+n2;
    	   nsoma=0;
    	   nmeio=n1+n2;
    	   nmeio/=2;
    	   nmeio*=100;
    	   while (n1<n2 - 1){
    		   
    		   n1= n1 +1;
    		   nsoma=nsoma+n1;
    		   System.out.print(n1 + " ");
    	   } 
    	   
    	   System.out.print(": " + nsoma + " : " + casas.format(nmeio));
       }else{
    	   System.out.println("erro");
       }
	}

}
