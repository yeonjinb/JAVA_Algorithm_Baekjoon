import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    	int a, b;
    	Scanner sc = new Scanner(System.in);
    	while (true) {
    		a = sc.nextInt();
        	b = sc.nextInt();
        	if(a+b==0) {
        		break;
        	}
        	else {
        		System.out.println((a+b));
        	}
    	}
    }  
}