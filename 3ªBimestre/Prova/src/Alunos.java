import java.util.Scanner;
public class Alunos {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int aluno, r;
		double renda, soma, media, rico;
		
		r = 0;
		soma = 0;
		rico = 0;
		
			for(aluno = 1;aluno<=40;aluno++) {
				System.out.println("Renda:");
				renda = ler.nextDouble();
				soma = renda + soma;
				
				if (rico<renda) {
					rico = renda;
					r = aluno;
				}
			}
			
			media = soma / 40;
			
			System.out.println("media:"+media);
			
			System.out.println("Soma das Rendas:"+soma); 
			
			System.out.println("Renda mais alta:"+rico);
			
			System.out.println("Aluno com Renda mais alta:"+r);
		
		ler.close();
	}
}
