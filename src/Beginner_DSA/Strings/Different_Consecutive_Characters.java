package Beginner_DSA.Strings;

public class Different_Consecutive_Characters {
    public static int method(int N, String S){
        int count = 0;
        for(int i = 1; i < N; i++){
            if(S.charAt(i-1) == S.charAt(i)){
                count++;
            }
        }
        return count;
    }
}
