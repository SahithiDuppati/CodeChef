package Beginner_DSA.Strings;

public class Wordle {
    public static void method(String S, String T) {
        StringBuilder M = new StringBuilder();
        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) != T.charAt(i)){
                M.append("B");
            }else{
                M.append("G");
            }
        }
        System.out.println(M);
    }
}
