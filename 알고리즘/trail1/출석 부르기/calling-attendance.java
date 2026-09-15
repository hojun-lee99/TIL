import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String name;

        if (n == 1) {
            name = "John";
        }
        else if (n == 2) {
            name = "Tom";
        }
        else if (n == 3) {
            name = "Paul";
        }
        else {
            name = "Vacancy";
        }

        System.out.print(name);
    }
}
