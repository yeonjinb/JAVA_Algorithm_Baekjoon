import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String S = sc.next();
    	
    	String revS = new StringBuilder(S).reverse().toString();
    	
    	if(S.equals(revS)) {
    		System.out.println(1);
    	}
    	else {
    		System.out.println(0);
    	}
    }
}