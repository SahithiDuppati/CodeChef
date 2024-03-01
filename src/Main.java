//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


import java.util.Scanner;

import static Beginner_DSA.Arrays.Find_Maximum_In_Array.method;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-- > 0){
            int N = scanner.nextInt();
            int[] array = new int[N];
            for(int i = 0; i < N; i++){
                array[i] = scanner.nextInt();
            }
            method(N, array);
        }
    }
}
