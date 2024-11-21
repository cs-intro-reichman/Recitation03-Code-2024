// Question 1, Expansion 3
public class ValidPassword2 {
    public static void main (String[] args) {
        String password = args[0];	
        String name = args[1];
        boolean valid = isValid(name, password);
    
        if (valid) {
            System.out.println("the password is valid");
        } else {
            System.out.println("the password is not valid");
        }
    }
    public static boolean isSubstring(String smaller, String bigger){
        boolean isSub = false;
        int lastIndex = bigger.length() - smaller.length() + 1;
        for (int i = 0; i < lastIndex && !isSub ; i++){
            if (smaller.charAt(0) == bigger.charAt(i)){
                isSub = true;
                for (int j = 0; j < smaller.length() && isSub ; j++){
                    isSub = (smaller.charAt(j) == bigger.charAt(i + j));
                }
            }
        }
        return isSub;	
    }

    public static boolean isSubstringBetter(String subString, String mainString) {
        if (subString.length() > mainString.length()) {
            return false;
        }
        for (int i = 0; i < mainString.length()-subString.length()+1; i++) {
            int j = 0;
            for (j = 0; j < subString.length(); j++) {
                if (mainString.charAt(i + j) != subString.charAt(j)) {
                    break;
                }
            }
            if (j == subString.length()) {
                return true;  // Found the substring
            }
        }
        return false;  // Substring not found
    }


  
    //Receives a String pass and returns if its a valid password
    public static boolean isValid(String pass, String name){

        boolean len = pass.length() >= 6;
        boolean capital = false;
        boolean small = false;
        boolean digit = false;
        if (!len && isSubstring(pass, name)){
	   	    return false;
        }
        for (int i = 0; i < pass.length(); i++){
            if (!small && isLower(pass.charAt(i))) {
                small = true;
            }
            if (!capital && isUpper(pass.charAt(i))) {
                capital = true;
            }
            if (!digit && isDigit(pass.charAt(i))) {
                digit = true;
            }
        }
        return (capital && small && digit);
    } 

    public static boolean isUpper(char ch){
        return ch >= 'A' && ch <= 'Z'; 
    }

    public static boolean isLower(char ch){
        return ch >= 'a' && ch <= 'z'; 
    }

    public static boolean isDigit(char ch){
        return ch >= '0' && ch <= '9';
    }
    
}
