import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int y3 = y / 100;
        int y2 = y % 100 /10;
        int y1 = y % 100 %10;
        System.out.println(x*y1);
        System.out.println(x*y2);
        System.out.println(x*y3);
        System.out.println(x*y);
    }
}