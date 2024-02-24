public class BubbleSortUsingRecursion {
    public static void bubbleSort(int[] arr,int size){
        if(size==0 || size==1)
            return ;
        for(int i=0;i<size;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        bubbleSort(arr,size-1);
    }
}
