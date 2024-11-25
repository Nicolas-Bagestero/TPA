import java.util.Scanner;
public class Potencia {

	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int base, expoente, resultado, i;
        
        System.out.print("Digite a base:");
        base = ler.nextInt();
        System.out.print("Digite o expoente:");
        expoente = ler.nextInt();
        
        resultado = 1;
        i = 1;

        while (i <= expoente) {

            resultado = resultado * base;
            i = i+1;
   
        }

       
        System.out.println(resultado);

        
        ler.close();
    }
}

