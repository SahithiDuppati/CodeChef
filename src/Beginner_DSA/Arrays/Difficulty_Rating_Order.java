package Beginner_DSA.Arrays;
//Scanner scanner = new Scanner(System.in);
//        int t = scanner.nextInt();
//
//        while (t-- > 0) {
//            int n = scanner.nextInt();
//            int[] d = new int[n];
//
//            for (int i = 0; i < n; i++) {
//                d[i] = scanner.nextInt();
//            }
//
//            // Your code goes here
//            method(n, d);
//        }
public class Difficulty_Rating_Order {
    public static void method(int n, int[] d){
        boolean bool = true;
        for(int i = 1;i < n;i++){
            if(d[i] < d[i-1]){
                bool = false;
            }
        }
        if(bool){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
