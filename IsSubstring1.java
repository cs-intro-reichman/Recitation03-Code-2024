// Question 2, Expansion 1
public class IsSubstring1 {
    public static void main(String[] args){
        String a = args[0];
        String b = args[1];	
    }
    
    
    public static boolean isSubstring(String smaller, String bigger){
        boolean isSub = false;
        int lastIndex = bigger.length() - smaller.length() + 1;
        for (int i = 0; i < lastIndex && !isSub; i++){
            if (smaller.charAt(0) == bigger.charAt(i)){
                isSub = true;
                for (int j = 0; j < smaller.length() && isSub ; j++){
                    isSub = (smaller.charAt(j) == bigger.charAt(i + j));
                }
            }
        }
        return isSub;	
    }
}
