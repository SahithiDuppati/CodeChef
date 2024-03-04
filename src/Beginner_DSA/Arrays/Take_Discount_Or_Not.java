package Beginner_DSA.Arrays;
//Scanner scanner = new Scanner(System.in);
//        int t = scanner.nextInt();
//
//        while (t-- > 0) {
//            int n = scanner.nextInt();
//            int x = scanner.nextInt();
//            int y = scanner.nextInt();
//            int[] a = new int[n];
//
//            for (int i = 0; i < n; i++) {
//                a[i] = scanner.nextInt();
//            }
//            method(n,x,y,a);
//        }
public class Take_Discount_Or_Not {
    public static void method(int N, int X, int Y, int[] array){
        int sum = 0;
        int discountedSum = 0;
        for(int i = 0; i < N; i++){
            sum += array[i];
            if(array[i] > Y){
                discountedSum += array[i] - Y;
            }
        }
        discountedSum += X;
        if(sum > discountedSum){
            System.out.println("COUPON");
        }else{
            System.out.println("NO COUPON");
        }
    }
}
