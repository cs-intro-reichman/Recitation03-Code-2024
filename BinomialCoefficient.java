// Question 3, Expansion 3
public class BinomialCoefficient {
    public static void main(String[] args) {
        long n = Integer.parseInt(args[0]); //GOOD NAME DUE TO FORMULA
        long k = Integer.parseInt(args[1]); //GOOD NAME DUE TO FORMULA
        long res = binomial(n, k);
        System.out.println(res);
    }
   
    public static long binomial(long n, long k) {
        if (n < 0 || k < 0){
		    return -1;
        }
        long numerator = factorial(n);
        long denoPart1 = factorial(k);
        long denoPart2 = factorial(n - k);
        return numerator / (denoPart1 * denoPart2);
    }

    public static long factorial(long n) {
        if (n < 0){
		    return -1;
        }
        long ans = 1;
        for (long i = 1; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }
}


