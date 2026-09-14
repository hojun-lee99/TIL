import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String[] sArr = s.split("-");

        System.out.print(sArr[2] + "." + sArr[0] + "." + sArr[1]);
    }
}
