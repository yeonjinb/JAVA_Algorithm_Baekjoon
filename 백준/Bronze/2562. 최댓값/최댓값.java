import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[9];
        
        int temp = 0;
        int index = 0;
        for (int i=0; i<9; i++) {
        	nums[i] = sc.nextInt();
        	if (nums[i] > temp) {
        		temp = nums[i];
        		index = i + 1;
        	}
        }
       
        System.out.println(temp);
        System.out.println(index);
    }
}
