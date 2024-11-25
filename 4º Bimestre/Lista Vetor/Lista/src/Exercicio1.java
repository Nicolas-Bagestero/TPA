import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a[], b[], i, j, par, impar;

		par = 0;
		impar = 0;
				
		a = new int[19];
		b = new int[19];
		
		for(i=0; i<=19; i++) {
			a[i] = ler.nextInt();
			if(a[i]%2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
			
		for(j=0; j<=19; j++) {
			if(a[j]%2 == 0) {
				a[j] = b[j];
			} else {
				
			}
			
		
		}
		
	
		
	}
	
}

