import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		
		int sum = 0;
		for (char c='a'; c <= 'z'; c++) {
			System.out.print(S.indexOf(c) + " ");
		}
	}
}

