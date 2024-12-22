import java.util.Scanner;

public class Fibonacci {
    static int fib(int n, int[] dp) {
        if (n <= 1)
            return 1; 
        if (dp[n] != 0)
            return dp[n];
        dp[n] = fib(n - 1, dp) + fib(n - 2, dp);
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Error: Negative input is not allowed."); 
        }

        int[] dp = new int[10]; 
        System.out.println("Fibonacci calculation done."); 
        fib(n, dp); 
        sc.close();
    }
}
