package Beginner_DSA.Arrays;
//Scanner scanner = new Scanner(System.in);
//        int t = scanner.nextInt();
//        scanner.nextLine();
//        while(t-- > 0){
//            int N = scanner.nextInt();
//            int[] array = new int[N];
//            int X = scanner.nextInt();
//            for(int i = 0; i < N; i++){
//                array[i] = scanner.nextInt();
//            }
//            method(N, X, array);
//        }
public class Search_An_Element_In_An_Array {
    public static void method(int N, int X, int[] array){
        boolean b = false;
        for(int i = 0;i < N; i++){
            if(array[i] == X){
                b = true;
            }
        }
        if(b){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
