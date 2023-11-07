public class Factorial {
    public static void main(String[] args) {
        int n = factorial(6);
        System.out.println(n);
    }

    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }
}
