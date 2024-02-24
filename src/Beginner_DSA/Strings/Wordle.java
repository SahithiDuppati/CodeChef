package Beginner_DSA.Strings;

//Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while(t-- > 0){
//            String S = sc.next();
//            String T = sc.next();
//            method(S,T);
//        }
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
