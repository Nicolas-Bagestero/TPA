import java.util.Scanner;
public class Futebol {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int id;
		System.out.println("Entre com  a idade da crian�a");
		id = ler.nextInt();
		
		switch(id) {
		case 6:
			System.out.println("Dente de leite");
			break;
		case 7:
			System.out.println("J�nior");
			break;
		case 8:
			System.out.println("J�nior max");
			break;
		case 9:
			System.out.println("J�nior master");
			break;
		case 10:
			System.out.println("master");
			break;
		default:
			System.out.println("Idade Inv�lida");
		}
		
		ler.close();

	}

}
