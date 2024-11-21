// Question 4
public class Substring {
    public static void main(String[] args) {
        // to run the first : java Substring A "{your string here}" {valid selected index here} 
        // to run the second : java Substring B "{your string here}" {valid smaller selected index here} {valid bigger selected index here}
        // to run the third : java Substring C "{your string here}" {true\false} 

        String mode = args[0];
        String str = args[1];
        int index = Integer.parseInt(args[2]);
        String res = "";
        switch (mode) {
            case "A":
                res = subs(str, index);
                break;
            case "B":
                int secondIndex = Integer.parseInt(args[3]);
                res = subs(str, index, secondIndex);
                break;
            case "C":
                boolean starts = Boolean.parseBoolean(args[3]);
                res = subs(str, index, starts);
            default:
                res = "Invalid mode was chosen";
        }
        System.out.println(res);
    }
    // Question 5 
    public static String subs(String str, int start) {
        String res = "";
        for (int i = start; i < str.length(); i++) {
            res += str.charAt(i);
        }
        return res;
    }
    // Question 5, Expansion 1
    public static String subs(String str, int start, int end ) {
        String res = "";
        for (int i = start; i < end; i++) {
            res += str.charAt(i);
        }
        return res;
    }
    
    // Question 5, Expansion 2
    // "hello", 3, true. -> "lo"
    // "hello", 3, false. -> "hel"
    public static String subs(String str, int index, boolean startsWith ) {
        if (startsWith){
            return subs(str,index); // goes to A
        }
    
        return subs(str,0,index); // goes to B
    }
    
    
    
    
}
