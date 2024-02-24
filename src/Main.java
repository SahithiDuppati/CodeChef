//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


import java.util.Scanner;

import static Beginner_DSA.Strings.Different_Consecutive_Characters.method;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while(t-- > 0){
            int N = scanner.nextInt();
            String S = scanner.next();
            System.out.println(method(N,S));
        }
    }
}
