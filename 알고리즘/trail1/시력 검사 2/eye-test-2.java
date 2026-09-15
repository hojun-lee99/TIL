import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        String type;

        if (a >= 1) {
            type = "High";
        }
        else if (a >= 0.5) {
            type = "Middle";
        }
        else {
            type = "Low";
        }

        System.out.print(type);
    }
}