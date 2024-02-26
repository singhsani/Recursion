public class QuickSortUsingRecursion {
    public static void quickSort(int[] arr,int s,int e){
        if(s>=e)
            return;
        int p=partition(arr,s,e);
        quickSort(arr,s,p-1);
        quickSort(arr,p+1,e);
    }

    private static int partition(int[] arr, int s, int e) {
        int pivote=arr[s];
        int count=0;
        for(int i=s+1;i<=e;i++){
            if(arr[i]<= pivote)
                count++;
        }
        int pivoteIndex=s+count;
        int temp=arr[s];
        arr[s]=arr[pivoteIndex];
        arr[pivoteIndex]=temp;
        int i=s,j=e;
        while(i<pivoteIndex && j>pivoteIndex){
            while(arr[i]<pivote){
                i++;
            }
            while(arr[j]>pivote){
                j--;
            }
            if(i<pivoteIndex && j>pivoteIndex){
                int temps=arr[i];
                arr[i]=arr[j];
                arr[j]=temps;
                i++;
                j--;
            }
        }
        return pivoteIndex;
    }
}
