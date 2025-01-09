import java.util.Scanner;

public class IterativeFibonacci {

    private int getNumber(Scanner in) {
        int n = in.nextInt();
        if (n < -1) {
            System.out.println("Please enter a positive number.");
            return getNumber(in);
        }
        if (n > 92) {
            System.out.println("Please enter a smaller number.");
            return getNumber(in);
        }
        return n;
    }

    private long findFibonacciNumber(int n) {
        if (n==0) return 0;
        int res = 1;
        int prevfib = 0;
        int fib = 1;
        for (int i = 1; i < n; i++) {
            res = fib + prevfib;
            prevfib = fib;
            fib = res;
        }
        return res;
    }

    public static void main(String[] args) {
        IterativeFibonacci f = new IterativeFibonacci();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter -1 to exit");
        int n;
        while (true) {
            System.out.println("Enter a number between 1 and 92");
            n = f.getNumber(in);
            if (n == -1) break;
            System.out.println(f.findFibonacciNumber(n));
        }
        in.close();
    }
}