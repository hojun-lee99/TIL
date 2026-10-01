import java.util.Scanner;

public class Main {
    public static int getLCM(int n, int m) {
        int i = 1;
        int lcm;
        while (true) {
            lcm = n * i;

            if (lcm % m == 0) {
                break;
            }

            i++;
        }

        return lcm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        int lcm = getLCM(n, m);

        System.out.print(lcm);
    }
}
