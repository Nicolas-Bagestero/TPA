
public class Tabuada {

	public static void main(String[] args) {
		int i2, i, r;
		
		i = 1;
		
		i2 = 1;
		
		while (i2<=10) {
			System.out.println(i2+ ":");
			
			while (i<=10) {
				r = i2*i;
				System.out.print(r + " ");
				i = i+1;
			}
			
			System.out.println("");
			i2 = i2+1;
			i = 1;
		}

	}

}
