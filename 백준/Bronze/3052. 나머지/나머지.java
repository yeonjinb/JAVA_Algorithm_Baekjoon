import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, rest, count = 0;
        int[] nums = new int[42];
        
        for (int i=0; i<10; i++) {
        	N = sc.nextInt();
        	rest = N % 42;
        	nums[rest] = 1;
       }        
       
       for (int i=0; i<42; i++) {
    	   if (nums[i] == 1) {
    		   count++;
    	   }
       }
       
       System.out.println(count);
    }
}
