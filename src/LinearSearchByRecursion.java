import java.util.Arrays;

public class LinearSearchByRecursion {
    public static int i=0;
    public static boolean searchData(int[] arr,int key,int size){
        if(size==0)
            return false;
        if(arr[0]==key)
            return true;
        else{
            return searchData(Arrays.copyOfRange(arr,i+1,size),key,size-1);
        }
    }
}
