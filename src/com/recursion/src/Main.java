import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3,6,1,8,5,2};
        findMax(arr,0,0);
    }
    static void findMax(int[] arr,int col,int max){
        if(col== arr.length){
            System.out.println(max);
            return;
        }
        if(arr[col] > max){
            max = arr[col];
        }
        findMax(arr, col+1, max);
    }
}