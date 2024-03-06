package Beginner_DSA.Arrays;

public class Min_To_Max {
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
    //            // Your code goes here
    //            method(n,a);
    //        }
    public static void method(int N, int[] a){
        int min = a[0];
        for(int i = 1;i < N; i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        int count = 0;
        for(int i = 0;i < N; i++){
            if(a[i] > min){
                count++;
            }
        }
        System.out.println(count);
    }
}
