import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int aMath = sc.nextInt();
        int aEnglish = sc.nextInt();
        int bMath = sc.nextInt();
        int bEnglish = sc.nextInt();

        if (aMath == bMath) {
            System.out.print(aEnglish > bEnglish ? "A" : "B");
        }
        else {
            System.out.print(aMath > bMath ? "A" : "B");
        }
    }
}