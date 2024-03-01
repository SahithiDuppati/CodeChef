package Beginner_DSA.Arrays;

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
