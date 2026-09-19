import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int small = 0;
        int same = 0;

        if (a < b) {
            small = 1;
        }

        if (a == b) {
            same = 1;
        }

        System.out.print(small + " " + same);
    }
}