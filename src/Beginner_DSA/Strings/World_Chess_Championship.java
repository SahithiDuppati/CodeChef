package Beginner_DSA.Strings;

public class World_Chess_Championship {
    public static void method(long X, String S){
        long prizeMoney = 0;
        int C = 0;
        int N = 0;
        int D = 0;
        for(int i = 0;i < 14; i++){
            if(S.charAt(i) == 'C'){
                C++;
            }else if(S.charAt(i) == 'D'){
                D++;
            }else{
                N++;
            }
        }
        int carlsenPoints = 2*C+D;
        int opponent = 2*N+D;
        if(carlsenPoints > opponent){
            System.out.println(X*60);
        }else if(carlsenPoints == opponent){
            System.out.println(X*55);
        }else{
            System.out.println(X*40);
        }
    }
}
