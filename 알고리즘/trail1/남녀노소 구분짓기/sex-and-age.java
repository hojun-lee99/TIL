import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int sex = sc.nextInt();
        int age = sc.nextInt();

        if (sex == 0) {
            if (age < 19) {
                System.out.print("BOY");
            }
            else {
                System.out.print("MAN");
            }
        }
        else {
            if (age < 19) {
                System.out.print("GIRL");
            }
            else {
                System.out.print("WOMAN");
            }
        }
    }
}