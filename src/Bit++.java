import java.util.Scanner;

public class Bit {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int contador = 0;


		for (int i = 0; i < n; i++) {
			String b = sc.next();

			if (b.equals("X++") || b.equals("++X")) contador++;
			else contador--;
		}

		System.out.println(contador);

	}

}
