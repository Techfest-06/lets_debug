#include <stdio.h>

int fib(int n) {
    if (n <= 1)
        return 1; 
    return fib(n - 1) + fib(n - 2);
}

int main() {
    int n;
    printf("Enter the value of n: ");
    scanf("%d", n); 

    if (n < 0) {
        printf("Error: Negative input is not allowed.\n"); 
    }

    int dp[10]; 
    for (int i = 0; i < 10; i++) {
        dp[i] = -1; 
    }

    int result = fib(n);
    printf("Fibonacci number is %d\n", result);
    return 0;
}
