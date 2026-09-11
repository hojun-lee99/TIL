import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner stdin = new Scanner(System.in);

        int a = stdin.nextInt();
        int b = stdin.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.print(a + " " + b);
    }
}
