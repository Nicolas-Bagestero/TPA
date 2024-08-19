import java.util.Scanner;
public class Nota {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int NMB,NB,NR,NI,total;
		String MB, B, R, I,nota;
		double porcentagem;
		
		System.out.println("Quantidade de Alunos com MB");
		NMB = ler.nextInt();
		System.out.println("Quantidade de Alunos com B");
		NB = ler.nextInt();
		System.out.println("Quantidade de Alunos com R");
		NR = ler.nextInt();
		System.out.println("Quantidade de Alunos com I");
		NI = ler.nextInt();
		
		total = NMB + NB + NR + NI;
		
		System.out.println("Total de Alunos:" +total);
		
		System.out.println("Escolha uma menção para mostrar a porcentagem:");
		nota = ler.next();
		
		switch (nota) {
		
		case "MB":
			porcentagem = (total*NMB)/100;
			System.out.println(porcentagem+"%");
			break;

		case "B":
			porcentagem = (total*NB)/100;
			System.out.println(porcentagem+"%");
			break;

		case "R":
			porcentagem = (total*NR)/100;
			System.out.println(porcentagem+"%");
			break;

		case "I":
			porcentagem = (total*NI)/100;
			System.out.println(porcentagem+"%");
			break;
		
		default:
			System.out.println("Invalido");
		
		}
		
		ler.close();

	}

}

