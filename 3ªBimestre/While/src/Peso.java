import java.util.Scanner;
public class Peso {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int altura,r;
		double peso;
		string sexo;
		
		r=1;
		
		do {
			System.out.println("Sexo:");
			sexo = ler.next();
			System.out.println("Altura:");
			altura = ler.nextInt();
			if ( sexo = equalsIgnoreCase("R")) {
				peso  = 52 + (0.75*(altura-152.4));
				System.out.println(peso);
			} else {
				peso = 52+(0.67*(altura-152.4));
				System.out.println(peso);
			}
			r = ler.nextInt();
		}while (r = 1);

	}

}
