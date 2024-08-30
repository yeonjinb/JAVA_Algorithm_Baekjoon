import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        
        nums[0] = sc.nextInt();
        int max = nums[0];
        int min = nums[0];
        for (int i=1; i<N; i++) {
        	nums[i] = sc.nextInt();
        	min = Math.min(nums[i], min);
        	max = Math.max(nums[i], max);
        }
       
        System.out.println(min+" "+max);
        
    }
}