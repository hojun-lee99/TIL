import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner stdin = new Scanner(System.in);

        double n = stdin.nextDouble();
        n *= 30.48;

        System.out.printf("%.1f", n);
    }
}
