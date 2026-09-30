import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char[] arr = new char[] {'L', 'E', 'B', 'R', 'O', 'S'};

        String s = sc.next();
        char c = s.charAt(0);
        int idx = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == c) {
                idx = i;
            }
        }

        if (idx == -1) {
            System.out.print("None");
        }
        else {
            System.out.print(idx);
        }
    }
}
