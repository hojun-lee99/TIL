import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int prodVal = 1;

        for (int i = 0; i < b; i++) {
            prodVal *= a;
        }

        System.out.print(prodVal);
    }
}
