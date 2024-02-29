package Beginner_DSA.Strings;

import java.util.HashMap;

//Scanner scanner = new Scanner(System.in);
//        int t = scanner.nextInt();
//        scanner.nextLine();
//        while(t-- > 0){
//            String S = scanner.nextLine();
//            method(S);
//        }
public class Chef_And_Happy_String {
    public static void method(String string){
        int length = string.length();
//        int count = 0;
//        for(int i = 0;i < length; i++){
//            if(string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u'){
//                count++;
//                if(count > 2){
//                    System.out.println("Happy");
//                    break;
//                }
//            }else{
//                count = 0;
//            }
//        }
//        if(count < 2){
//            System.out.println("Sad");
//        }
        if(string.matches(".*[a,e,i,o,u]{3,}.*")){
            System.out.println("Happy");
        }else{
            System.out.println("Sad");
        }
    }
}
