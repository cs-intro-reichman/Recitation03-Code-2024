// Question 1
public class IsSubstring {
    public static void main(String[] args){
        String firstString = args[0];
        String secondString = args[1];
        boolean isSub = false;
        int lastIndex = secondString.length() - firstString.length() + 1;
        for (int i = 0; i < lastIndex && !isSub ; i++){
            if (firstString.charAt(0) == secondString.charAt(i)){
                isSub = true;
                for (int j = 0; j < firstString.length() && isSub ; j++){
                    isSub = (firstString.charAt(j) == secondString.charAt(i + j));
                }
            }
        }
        System.out.println(isSub);	
    }
}
