import java.util.ArrayList;
import java.util.Scanner;

public class StonesontheTable {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cont = 0;
		String s = sc.next();
		ArrayList arr = new ArrayList<>();
		
		for (int i = 0; i < s.length(); i++) {
			arr.add(s.charAt(i));
		}
		
		while (distintos(arr) == false) {
			for (int i = 1; i < arr.size(); i += 2) {
				if (i == arr.size() - 1) {
					if (arr.get(i) == arr.get(i - 1)) {
						arr.remove(i);
						cont++;
					}
				} else {
					if ((arr.get(i) == arr.get(i - 1)) || (arr.get(i) == arr.get(i + 1))) {
						arr.remove(i);
						cont++;
					}
				}
			}
		}
		
		System.out.println(cont);
		
	}
	
	public static boolean distintos(ArrayList arr) {
		boolean distinto = true;
		
		for (int i = 1; i < arr.size(); i += 2) {
			if (i == arr.size() - 1) {
				if (arr.get(i) == arr.get(i - 1)) {
					distinto = false;
					break;
				}
			} else {
				if ((arr.get(i) == arr.get(i - 1)) || (arr.get(i) == arr.get(i + 1))) {
					distinto = false;
					break;
				}
			}
		}
		
		return distinto;
	}
	
}