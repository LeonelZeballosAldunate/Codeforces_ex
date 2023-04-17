import java.util.Scanner;

public class NextRound {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int ki = sc.nextInt();
		int scores[] = new int[n];
		int c = 0;
		
		for (int i = 0; i < n; i++) {
			scores[i] = sc.nextInt();
		}
		
		for (int i : scores) {			
			if ((i >= scores[ki - 1]) && (i > 0)) {
				c++;
			}
		}
		
		System.out.println(c);
		
	}
	
}