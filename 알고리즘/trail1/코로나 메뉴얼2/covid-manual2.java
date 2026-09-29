import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];

        for (int i = 0; i < 3; i++) {
            String s = sc.next();
            int temp = sc.nextInt();

            if (s.equals("Y") && temp >= 37) {
                arr[0]++;
            }
            else if (s.equals("N") && temp >= 37) {
                arr[1]++;
            }
            else if (s.equals("Y") && temp < 37) {
                arr[2]++;
            }
            else {
                arr[3]++;
            }
        }

        System.out.printf("%d %d %d %d ", arr[0], arr[1], arr[2], arr[3]);

        if (arr[0] >= 2) {
            System.out.print("E");
        }
    }
}
