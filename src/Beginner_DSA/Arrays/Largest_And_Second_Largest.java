package Beginner_DSA.Arrays;

public class Largest_And_Second_Largest {
    public static void method(int N, int[] a){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0; i < N; i++){
            if(a[i] > max){
                secondMax = max;
                max = a[i];
            } else if(a[i] > secondMax && a[i] != max){
                secondMax = a[i];
            }
        }
        System.out.println(max + secondMax);
    }
}
