import java.util.Arrays;
import java.util.Scanner;

public class BoyOrGirl {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		char[] c = name.toCharArray();
		int contador = 0;
		
		Arrays.sort(c);
		
		for (int i = 0; i < c.length - 1; i++) {
			if (i == 0) {
				contador++;
			}
			
			if (c[i] != c[i + 1]) {
				contador++;
			}
		}
		
		System.out.println((contador & 1) == 0 ? "CHAT WITH HER!" : "IGNORE HIM!");
		
	}
	
}