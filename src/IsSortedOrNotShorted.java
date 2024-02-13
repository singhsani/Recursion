import java.util.Arrays;

public class IsSortedOrNotShorted {
    public static int i=0;
    public static boolean isSortedOrNot(int[] arr, int size){
        if(size==0 || size==1)
            return true;
        if(arr[1]<arr[0]){
            return false;
        }else{
           return isSortedOrNot(Arrays.copyOfRange(arr,i+1,size),size-1);
        }
    }
}
