import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int i = a < b ? a : b;
        int j = a > b ? a : b;

        int sumVal = 0;

        for (; i <= j; i++) {
            if (i % 5 == 0) {
                sumVal += i;
            }
        }

        System.out.print(sumVal);
    }
}
