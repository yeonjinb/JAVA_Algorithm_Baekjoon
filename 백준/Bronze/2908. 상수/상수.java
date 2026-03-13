import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String A = sc.next();
        String B = sc.next();
        
        String revA = new StringBuilder(A).reverse().toString();
        String revB = new StringBuilder(B).reverse().toString();
    
        int numA = Integer.parseInt(revA);
        int numB = Integer.parseInt(revB);
        
        System.out.println(Math.max(numA, numB));
    }
}