package syntax;

public class Recursion {
    public static void main(String[] args) {
        // countToHundredFrom(1);
        // int result = sumOfNumbersToN(6);
        // System.out.println(result);
        int result = nthFibonacciNumber(10);
        System.out.println(result);
    }

    static void countToHundredFrom(int start) {

        System.out.println(start);
        //base case
        if (start >= 100) {
            return;
        }

        countToHundredFrom(start + 1);
    }

    static int sumOfNumbersToN(int n) {
        // base case
        if (n == 0) {
            return 0;
        }
        // reduction step
        return n + sumOfNumbersToN(n - 1);
    }

    // branching
    static int nthFibonacciNumber(int n) {
        // sum of n-1 term and the n-2 term
        if (n > 1) {
            return nthFibonacciNumber(n - 1) + nthFibonacciNumber(n - 2);

        }

        return 1;
    }


}
