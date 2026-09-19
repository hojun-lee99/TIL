import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String bool;
        int temp;
        int count = 0;

        for (int i = 0; i < 3; i++) {
            bool = sc.next();
            temp = sc.nextInt();

            if (bool.equals("Y") && temp >= 37) {
                count += 1;
            }
        }

        System.out.print(count > 1 ? "E" : "N");

    }
}
