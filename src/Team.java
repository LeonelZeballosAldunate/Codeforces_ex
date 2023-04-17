import java.util.Scanner;

public class Team {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sec;
		int t = 0;
		
		for (int i = 0; i < n; i++) {
			sec = 0;
			int arr[] = new int[3];
			
			for (int a = 0; a < 3; a++) {
				arr[a] = sc.nextInt();
				if (arr[a] == 1)
					sec++;
			}
			
			if (sec >= 2) {
				t++;
			}
		}
		
		System.out.println(t);
	}
	
}