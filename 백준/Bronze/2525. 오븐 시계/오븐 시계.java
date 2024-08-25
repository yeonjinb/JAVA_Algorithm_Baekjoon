import java.util.Scanner;
public class Main{
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        
        A += C/60;
        B += C%60;
        
        if (B >= 60) {
        	B -= 60;
        	A += 1;
        }
        
        if (A >= 24) {
        	A -= 24;
        }
        
        
        System.out.println(A+" "+B);
    }  
}