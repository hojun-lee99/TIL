import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Set<Integer> aSet = new HashSet<>(Arrays.asList(1, 3, 5, 7, 8, 10, 12));
        Set<Integer> bSet = new HashSet<>(Arrays.asList(4, 6, 9, 11));

        if (aSet.contains(n)) {
            System.out.print(31);
        }
        else if (bSet.contains(n)) {
            System.out.print(30);
        }
        else {
            System.out.print(28);
        }
    }
}