import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] id = new int[31];

        for (int i = 0; i < 28; i++) {
            int num = scanner.nextInt();
            id[num] = 1;
        }
        for (int i = 1; i < 31; i++) {
            if (id[i] == 0) {
                System.out.println(i);
            }
        }
    }
}