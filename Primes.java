// Question 2
public class Primes {
    public static void main (String[] args){
        int max = Integer.parseInt(args[0]);
        System.out.println(primalDecomposition(max));
    }
    
    public static String primalDecomposition(int max) {
        String result = "";
        // for each number up to max check if its prime, if so check
        // how many times it divides by max
        // and print it the required amount of times.
        int current = max;
        for (int i = 2; i <= max; i++) {
            if (isPrime(i)) {
                while (current % i == 0) {
                    current = current / i;
                    if (current != 1) {
                        result += i + "*";
                    } else {
                        result += i;
                    }
                }
            }
        }
        return result;
    }
 
    
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
    
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
