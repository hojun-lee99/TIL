import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] n = new int[2];

        while (true) {
            n[0] = n[1];
            n[1] = sc.nextInt();

            if (n[1] % 3 == 0) {
                break;
            }
        }

        System.out.print(n[0]);
    }
}
