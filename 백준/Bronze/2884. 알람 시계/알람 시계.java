import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int H, M;
        Scanner scan = new Scanner(System.in);
        H = scan.nextInt();
        M = scan.nextInt();
        if(M < 45){
            if(H == 0){
                H = 23;
            }
            else {
                H -= 1;
            }
            M = M + 15;
        }
        else{
            M -= 45;
        }
        System.out.println(H+" "+M);
    }
}