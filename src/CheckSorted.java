//import java.util.Arrays;

public class CheckSorted {

    public static boolean Haumia(int[] arr, int index){
        if(index == arr.length-1){
            return true;
        }
        if(arr[index] <= arr[index+1]){
            //means array is sorted for one step
            return Haumia(arr, index+1);
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Haumia(array, 0));

    }
}
