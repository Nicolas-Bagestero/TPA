
public class Anos {
	    public static void main(String[] args) {
	    	double alturaJoao, alturaPedro;
	    	int anos;
	    	
	        alturaJoao = 1.34;
	        alturaPedro = 1.45;
	      
	        anos = 0;

	        while (alturaJoao <= alturaPedro) {
	            alturaJoao = alturaJoao + 0.025;
	            alturaPedro = alturaPedro + 0.02;
	            anos++;
	        }

	        System.out.println( anos + " anos");
	    }
	}

