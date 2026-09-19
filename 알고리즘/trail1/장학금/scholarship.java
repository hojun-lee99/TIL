import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int middle = sc.nextInt();
        int finalS = sc.nextInt();
        int scholarship = 0;

        if (middle >= 90) {
            if (finalS >= 95) {
                scholarship += 100000;
            }
            else if (finalS >= 90) {
                scholarship += 50000;
            }
        }

        System.out.print(scholarship);
    }
}