#include <iostream>
#include <vector>
using namespace std;

int fib(int n, vector<int>& dp) {
    if (n <= 1)
        return 1; 
    if (dp[n] != -1)
        return dp[n];
    dp[n] = fib(n - 1, dp) + fib(n - 2, dp);
    return dp[n];
}

int main() {
    int n;
    cout << "Enter the value of n: ";
    cin >> n;

    if (n < 0) {
        cout << "Error: Negative input is not allowed.\n"; 
    }

    vector<int> dp(10, -1); 
    fib(n, dp); 
    cout << "Fibonacci calculation done." << endl; 
    return 0;
}
