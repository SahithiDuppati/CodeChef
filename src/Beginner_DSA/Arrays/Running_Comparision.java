package Beginner_DSA.Arrays;

public class Running_Comparision {
    //Scanner scanner = new Scanner(System.in);
    //        int t = scanner.nextInt();
    //
    //        while (t-- > 0) {
    //            int n = scanner.nextInt();
    //            int[] a = new int[n];
    //            int[] b = new int[n];
    //
    //            for (int i = 0; i < n; i++) {
    //                a[i] = scanner.nextInt();
    //            }
    //
    //            for (int i = 0; i < n; i++) {
    //                b[i] = scanner.nextInt();
    //            }
    //            method(n,a,b);
    //        }
    public static void method(int n, int[] a, int[] b){
        int count = 0;
        for(int i = 0;i < n; i++){
            if(a[i] <= (2*b[i]) && b[i]  <= (2*a[i])){
                count++;
            }
        }
        System.out.println(count);
    }
}
