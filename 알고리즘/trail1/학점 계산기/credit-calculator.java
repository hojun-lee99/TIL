import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] total = new double[n];
        double score = 0;

        for (int i = 0; i < n; i++) {
            total[i] = sc.nextDouble();
            score += total[i];
        }

        double avg = score / n;
        
        System.out.printf("%.1f\n", avg);
        if(avg < 3.0) {
            System.out.print("Poor");
        }
        else if(avg < 4.0) {
            System.out.print("Good");
        }
        else {
            System.out.print("Perfect");
        }
    }
}
