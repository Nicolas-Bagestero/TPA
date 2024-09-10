import java.util.Scanner;
public class Tabuada {

	public static void main(String[] args) {
		int n, i, r;
		Scanner ler = new Scanner(System.in);
		
		n = ler.nextInt();
		
		i = 1;
		while (i<=10) {
			r = n*i;
			System.out.print(r+" ");
			i = i+1;
		}

		ler.close();
	}

}
