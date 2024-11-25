
public class Multiplos {

	public static void main(String args[]) {
		int i,m;
	
		for(i=1;i<=100;i++) {
			System.out.println(i);
			m = i % 10;
			if(m==0) {
				System.out.println("Múltiplo de 10");
			}
		}
	}
}