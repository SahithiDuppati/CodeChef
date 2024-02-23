package Beginner_DSA.Strings;

import java.util.Scanner;

public class DNA_Storage {
//    Scanner scanner = new Scanner(System.in);
//    int t = scanner.nextInt();
//
//        while(t-- > 0) {
//        int n = scanner.nextInt();
//        String s = scanner.next();
//        System.out.println(DNA_Storage.method(n, s));
//    }
    public static String method(int n, String s){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < s.length(); i = i + 2){
            String substring = s.substring(i, i + 2);
            switch (substring) {
                case "00":
                    stringBuilder.append("A");
                    break;
                case "01":
                    stringBuilder.append("T");
                    break;
                case "10":
                    stringBuilder.append("C");
                    break;
                case "11":
                    stringBuilder.append("G");
                    break;
                default:
                    break;
            }
        }
        return stringBuilder.toString();
    }
}
