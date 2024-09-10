import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero, primo, i;
        double resultado;
        
        System.out.print("Digite um número:");
        numero = ler.nextInt();
        
        primo = 0;
        i = 2;

        while (i < numero) {

            resultado = numero % i;
            i = i+1;
            if (resultado == 0) {
            	primo = primo + 1;
            }
        }

        if (primo >=1 || numero == 1) {
        	System.out.println("Não Primo");
        }else {
        	System.out.println("Primo");
        }

        
        ler.close();
    }
}
