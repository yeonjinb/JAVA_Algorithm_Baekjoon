import java.util.Scanner;
public class Main{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int i = sc.nextInt();
       int j = sc.nextInt();
       int k = sc.nextInt();
       int prize;
       
       if (i==j && i==k) {
    	   prize = 10000 + i*1000;
       }
       else if (i==j) {
    	   prize = 1000 + i*100;
       }
       else if (j==k) {
    	   prize = 1000 + j*100;
       }
       else if (k==i) {
    	   prize = 1000 + k*100;
       }
       else {
    	   int temp = i;
    	   if (temp < j) {
    		   temp = j;
    	   }
    	   if (temp < k) {
    		   temp = k;
    	   }
    	   prize = temp*100;
       }
       
       System.out.println(prize);
    }  
}