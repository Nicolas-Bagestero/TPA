import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero, fatorial, i;
        
        System.out.print("Digite um número:");
        numero = ler.nextInt();
        
        fatorial=1;
        i = 1;

        while (i <= numero) {

            fatorial = fatorial * i;
            i = i+1;
   
        }

       
        System.out.println(fatorial);

        
        ler.close();
    }
}
