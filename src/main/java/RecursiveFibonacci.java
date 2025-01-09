import java.util.Scanner;

public class RecursiveFibonacci {

    private int getNumber(Scanner in){
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

    private long findFibonacciNumber(int n){
        if (n<=1){
            return n;
        }
        return findFibonacciNumber(n-1) + findFibonacciNumber(n-2);
    }

    public static void main(String[] args) {
        RecursiveFibonacci f = new RecursiveFibonacci();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter -1 to exit");
        int n;
        while(true){
            System.out.println("Enter a number between 1 and 92");
            n = f.getNumber(in);
            if (n==-1) break;
            System.out.println(f.findFibonacciNumber(n));
        }
        in.close();
    }
}
