import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int temperature = sc.nextInt();
        String type;

        if (temperature < 0) {
            type = "ice";
        }
        else if (temperature >= 100) {
            type = "vapor";
        }
        else {
            type = "water";
        }

        System.out.print(type);
    }
}