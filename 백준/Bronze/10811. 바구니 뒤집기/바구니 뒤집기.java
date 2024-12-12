import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] nums = new int[N];
        for (int i=0; i<N; i++) {
        	nums[i] = i + 1;
        }
        
        int I, J = 0;
        
        for (int i=0; i<M; i++) {
        	I = sc.nextInt();
        	J = sc.nextInt();
        	
        	int tmp = 0;
        	int left = I-1;
        	int right = J-1;
        	while(left < right) {
	       		tmp = nums[left];
	       		nums[left] = nums[right];
	       		nums[right] = tmp;
	       		
	       		left++; 
	       		right--;
        	}
       }        
       
       for (int i=0; i<N; i++) {
    	   System.out.print(nums[i] + " ");
       }
       
       
    }
}
