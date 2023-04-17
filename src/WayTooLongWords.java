import java.util.Scanner;

public class WayTooLongWords {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String words[] = new String[n];
		
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			words[i] = sc.nextLine();
		}
		
		for (String w : words) {
			if (w.length() > 10) {
				System.out.println("" + w.charAt(0) + (w.length() - 2) + w.charAt(w.length() - 1));
			} else {
				System.out.println(w);
			}
		}
		
	}
	
}