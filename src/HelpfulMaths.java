import java.util.Scanner;

public class HelpfulMaths {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		int numbers[] = new int[s.length() - (s.length() / 2)];
		int j = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) == '1') || (s.charAt(i) == '2') || (s.charAt(i) == '3')) {
				numbers[j] = Character.getNumericValue(s.charAt(i));
				j++;
			}
		}
		
		sort(numbers);
		
		String res = "";
		
		for (int i = 0; i < numbers.length; i++) {
			if (i != numbers.length - 1) {
				res += numbers[i] + "+";
			}
			else {
				res += numbers[i];
			}
		}
		
		System.out.println(res);
		
	}
	
	public static void sort(int[] arreglo) {
		for (int i = 0; i < arreglo.length - 1; i++) {
			for (int a = 0; a < arreglo.length - 1; a++) {
				if (arreglo[a] > arreglo[a + 1]) {
					int aux = arreglo[a];
					arreglo[a] = arreglo[a + 1];
					arreglo[a + 1] = aux;
				}
			}
		}
	}
	
}