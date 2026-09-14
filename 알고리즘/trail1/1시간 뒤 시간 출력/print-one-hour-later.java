import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String[] sArr = s.split(":");

        System.out.print((Integer.parseInt(sArr[0]) + 1) + ":" + sArr[1]);
    }
}
