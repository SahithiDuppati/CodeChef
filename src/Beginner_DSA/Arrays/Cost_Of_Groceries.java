package Beginner_DSA.Arrays;
//Scanner scanner = new Scanner(System.in);
//        int t = scanner.nextInt();
//
//        while (t-- > 0) {
//            int n = scanner.nextInt();
//            int x = scanner.nextInt();
//            int[] a = new int[n];
//            int[] b = new int[n];
//
//            for (int i = 0; i < n; i++) {
//                a[i] = scanner.nextInt();
//            }
//
//            for (int j = 0; j < n; j++) {
//                b[j] = scanner.nextInt();
//            }
//
//            method(a,b,x,n);
//      }
public class Cost_Of_Groceries {
    public static void method(int[] a, int[] b, int x, int n){
        int cost = 0;
        for(int i = 0;i < n; i++){
            if(a[i] >= x){
                cost += b[i];
            }
        }
        System.out.println(cost);
    }
}
