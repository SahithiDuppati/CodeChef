package Beginner_DSA.Arrays;
//Scanner scanner = new Scanner(System.in);
//        int t = scanner.nextInt();
//
//        while (t-- > 0) {
//            int n = scanner.nextInt();
//            int[] a = new int[n];
//
//            for (int i = 0; i < n; i++) {
//                a[i] = scanner.nextInt();
//            }
//
//            method(n,a);
//        }
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
