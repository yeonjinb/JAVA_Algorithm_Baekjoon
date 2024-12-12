import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] basket = new int[N];
        for (int i=0; i<N; i++) {
        	basket[i] = i + 1;
        }
      
        int I, J, tmp = 0;
        for (int i=0; i<M; i++) {
        	I = sc.nextInt();
        	J = sc.nextInt();
        	
        	tmp = basket[I-1];
        	basket[I-1] = basket[J-1];
        	basket[J-1] = tmp;
        	}
       for (int i=0; i<N; i++) {
        System.out.print(basket[i]+" ");
       }        
    }
}
