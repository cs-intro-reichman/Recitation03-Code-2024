// Question 2, Expansion 2 
public class ValidPassword1 {
    public static void main (String[] args) {
        String password = args[0];	
        boolean valid = isValid(password);
    
        if (valid) {
            System.out.println("the password is valid");
        } else {
            System.out.println("the password is not valid");
        }
    }
    //Receives a String pass and returns if its a valid password
    public static boolean isValid(String pass){

        boolean len = pass.length() >= 6;
        boolean capital = false;
        boolean small = false;
        boolean digit = false;

        if (!len){
	   	    return false;
        }
        // 
        for (int i = 0; i < pass.length(); i++){
            char curChar = pass.charAt(i);
            if (!small && isLower(curChar)) {
                small = true;
            }
            if (!capital && isUpper(curChar)) {
                capital = true;
            }
            if (!digit && isDigit(curChar)) {
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
