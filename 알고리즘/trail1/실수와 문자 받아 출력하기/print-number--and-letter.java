import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char c = s.charAt(0);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.printf("%c\n%.2f\n%.2f", c, a, b);
    }
}