import java.util.Scanner;
public class Fibonacci {
	
	  public static void main(String[] args) {
	        Scanner ler = new Scanner(System.in);
	        int numero, antecessor1, antecessor2,i;
	        
	        System.out.print("Digite um número:");
	        numero = ler.nextInt();
	        
	        antecessor1 = numero;
	        antecessor2 = 0;
	        i = 1;
	        
	        while (i <= 11) {
	        	
	            numero = antecessor1 + antecessor2;
	            System.out.println(numero);
	            antecessor1 = antecessor2;
	            antecessor2 = numero;
	            i = i+1;
	   
	        }

	        ler.close();
	    }
	}
