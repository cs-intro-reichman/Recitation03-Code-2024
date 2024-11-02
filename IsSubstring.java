// Question 2
public class IsSubstring {
    public static void main(String[] args){
        String a = args[0];
        String b = args[1];
        boolean isSub = false;
        int lastIndex = b.length() - a.length() + 1;
        for (int i = 0; i < lastIndex && !isSub ; i++){
            if (a.charAt(0) == b.charAt(i)){
                isSub = true;
                for (int j = 0; j < a.length() && isSub ; j++){
                    isSub = (a.charAt(j) == b.charAt(i + j));
                }
            }
        }
        System.out.println(isSub);	
    }
}
