import java.util.Scanner;

public class TheatreSquare {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long m = sc.nextLong();
		int a = sc.nextInt();
		long numsm;
		long numsn;
		
		if (m % a != 0) {
			numsm = (m / a) + 1;
		} else {
			numsm = m / a;
		}
		
		if (n % a != 0) {
			numsn = (n / a) + 1;
		} else {
			numsn = n / a;
		}
		
		System.out.println(numsn * numsm);
		
	}
	
}