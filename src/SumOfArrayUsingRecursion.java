public class SumOfArrayUsingRecursion {
    public static int sum=0;
    public static int sum(int[] arr,int size){
        if(size == 0){
            return 0;
        }
        if(size==1){
            return arr[0];
        }
        sum+=arr[size-1];
        sum(arr,size-1);
        return sum;
    }
}
