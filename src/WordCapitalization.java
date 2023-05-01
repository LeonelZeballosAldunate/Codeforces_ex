import java.util.Scanner;

public class WordCapitalization {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String w = sc.next();
		
		for (int i = 0; i < w.length(); i++) {
			if (i == 0) {
				System.out.print(w.toUpperCase().charAt(0));
			}
			else {
				System.out.print(w.charAt(i));
			}
		}
		
	}
	
}
