import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int sumVal = 0;

        for (int i = 0; i < 10; i++) {
            int val = sc.nextInt();

            if (val >= 0 && val <= 200) {
                cnt++;
                sumVal += val;
            }
        }

        double avgVal = (double) sumVal / cnt;

        System.out.printf("%d %.1f", sumVal, avgVal);
    }
}
