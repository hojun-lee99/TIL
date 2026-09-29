import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int a2 = sc.nextInt();

        System.out.print(a1 + " " + a2 + " ");

        for (int i = 0; i < 8; i++) {
            int temp = 2 * a1 + a2;
            a1 = a2;
            a2 = temp;

            System.out.print(temp + " ");
        }
    }
}
