import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int n = a + (a % 2);
        while (n <= b) {
            System.out.print(n + " ");
            n += 2;
        }
    }
}
