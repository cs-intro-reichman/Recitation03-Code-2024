// Question 3, Expansion 3
public class StudentUnion {
    public static void main(String[] args) {
        long n = Integer.parseInt(args[0]); //GOOD NAME DUE TO FORMULA
        long k = Integer.parseInt(args[1]); //GOOD NAME DUE TO FORMULA
        long l = Integer.parseInt(args[2]); //GOOD NAME DUE TO FORMULA
        System.out.println(binomial(n, k) * binomial(k, l));
    }
   
    public static long binomial(long n, long k) {
        if (n < 0 || k < 0){
		    return -1;
        }
        long a = factorial(n);
        long b = factorial(k);
        long c = factorial(n - k);
        return a / (b * c);
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
