package Beginner_DSA.Strings;

public class Blobby_Volley_Scores {
    public static void method(String S){
        Character previous = 'A';
        int A = 0;
        int B = 0;
        for(int i = 0;i < S.length(); i++){
            if(S.charAt(i) == previous){
                if(S.charAt(i) == 'A'){
                    A++;
                }else{
                    B++;
                }
            }
            previous = S.charAt(i);
        }
        System.out.println(A + " " + B);
    }
}
