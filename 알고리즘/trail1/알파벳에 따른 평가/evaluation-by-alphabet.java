import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String c = sc.next();
        String str;

        if (c.equals("S")) {
            str = "Superior";
        }
        else if (c.equals("A")) {
            str = "Excellent";
        }
        else if (c.equals("B")) {
            str = "Good";
        }
        else if (c.equals("C")) {
            str = "Usually";
        }
        else if (c.equals("D")) {
            str = "Effort";
        }
        else {
            str = "Failure";
        }

        System.out.print(str);
    }
}