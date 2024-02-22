//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import Beginner_DSA.Strings.DNA_Storage;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while(t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            System.out.println(DNA_Storage.method(n, s));
        }

    }
}
