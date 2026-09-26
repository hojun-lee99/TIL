import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sumVal = 0;

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            sumVal += val;
        }

        double avgVal = (double) sumVal / n;

        System.out.printf("%d %.1f", sumVal, avgVal);
    }
}
