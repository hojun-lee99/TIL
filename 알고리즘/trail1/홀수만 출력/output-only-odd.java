import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int n;

        if (a % 2 == 1) {
            n = a;
        }
        else {
            n = a + 1;
        }

        for (int i = n; i <= b; i += 2) {
            System.out.print(i + " ");
        }
    }
}
