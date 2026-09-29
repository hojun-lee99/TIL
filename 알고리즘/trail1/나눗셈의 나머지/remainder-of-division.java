import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] cnt = new int[b];

        while (a > 1) {
            int remain = a % b;
            cnt[remain]++;
            a /= b;
        }

        int sum = 0;

        for (int i = 0; i < b; i++) {
            sum = sum + (cnt[i] * cnt[i]);
        }

        System.out.print(sum);
    }
}
