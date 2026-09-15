import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int sub;

        if ( a < b ) {
            sub = b - a;
        }
        else {
            sub = a - b;
        }

        System.out.print(sub);
    }
}