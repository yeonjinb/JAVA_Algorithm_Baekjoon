import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        double max = 0;
        double total = 0;
        double avg = 0;
        
        double[] nums = new double[N];
        for (int i=0; i<N; i++) {
            int M = sc.nextInt();
        	nums[i] = M;
        	if (nums[i]>max) {
        		max = nums[i];
        	}
        }
        
        for (int i=0; i<N; i++) {
        	nums[i] = nums[i]/max*100;
        	total += nums[i];
        }
        
        avg = total / N;
        System.out.println(avg);
    }
}
