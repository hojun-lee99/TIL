import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a+b;
        int sub = a-b;

        double divide = (double)sum / sub;

        System.out.printf("%.2f", divide);
    }
}