public class MargeSortUsingRecursion {
    public static void divideConquer(int[] arr,int s,int e){

        if(s<e) {
            int mid = s + (e - s) / 2;
            divideConquer(arr, s, mid);
            divideConquer(arr, mid + 1, e);
            marge(arr, s, mid, e);
        }
    }

    private static void marge(int[] arr, int s,int mid, int e) {
        int l1=mid-s+1;
        int l2=e-mid;
        int[] part1=new int[l1];
        int[] part2=new int[l2];
        int startIndex=s;
        for(int i=0;i<l1;i++){
            part1[i]=arr[s+i];
        }
        for(int j=0;j<l2;j++){
            part2[j]=arr[mid+1+j];
        }
        startIndex=0;
        int index=0;
        int index1=0;
        while(index<l1 && index1<l2){
            if(part1[index] < part2[index1]){
                arr[startIndex]=part1[index];
                index++;
            }else{
                arr[startIndex]=part2[index1];
                index1++;
            }
            startIndex++;
        }
        while(index<l1){
            arr[startIndex]=part1[index];
            startIndex++;
            index++;
        }
        while(index1<l2){
            arr[startIndex]=part2[index1];
            startIndex++;
            index1++;
        }

    }
}
