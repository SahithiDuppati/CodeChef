package Beginner_DSA.Arrays;
//Scanner scanner = new Scanner(System.in);
//        int t = scanner.nextInt();
//        scanner.nextLine();
//        while(t-- > 0){
//            int N = scanner.nextInt();
//            int[] array = new int[N];
//            for(int i = 0; i < N; i++){
//                array[i] = scanner.nextInt();
//            }
//            method(N, array);
//        }
public class Find_Maximum_In_Array {
    public static void method(int N, int[] array){
        int max = array[0];
        for(int i = 1;i < N; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
