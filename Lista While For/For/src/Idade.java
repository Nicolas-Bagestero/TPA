import java.util.Scanner;
public class Idade {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i,idade,atual,nasc,novo,velho;
		
		novo = 999;
		velho = 0;
		
		System.out.println("Ano Atual:");
		atual = ler.nextInt();
		
		for(i=2;i<=10;i++) {
			System.out.println("Ano de Nascimento:");	
			nasc = ler.nextInt();
			idade = atual-nasc;
			
			if (idade<novo) {
				novo = idade;
			}else if (idade>velho) {
				velho = idade;
			} 
			
			System.out.println(i + ". " + idade);
		}
		
		System.out.println("Mais velho:" + velho);
		System.out.println("Mais novo:" + novo);
		
	}

}
