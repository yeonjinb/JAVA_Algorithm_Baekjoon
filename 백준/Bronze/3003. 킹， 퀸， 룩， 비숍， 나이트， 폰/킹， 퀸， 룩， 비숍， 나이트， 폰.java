import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int[] arr = {1, 1, 2, 2, 2, 8};
    	int num = 0;
    	for(int i = 0; i < arr.length; i++) {
    		num = sc.nextInt();
    		arr[i] = arr[i]-num;
    		System.out.print(arr[i] + " ");
    	}
    }
}