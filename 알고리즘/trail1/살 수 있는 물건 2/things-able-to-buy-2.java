import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String stuff;

        if (n >= 3000) {
            stuff = "book";
        }
        else if (n >= 1000) {
            stuff = "mask";
        }
        else if (n >= 500) {
            stuff = "pen";
        }
        else {
            stuff = "no";
        }

        System.out.print(stuff);
    }
}