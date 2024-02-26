import java.util.List;

public class Main {
    public static void main(String[] args) {
//        PowerUsingRecursion power=new PowerUsingRecursion();
//        System.out.println(power.power(3,4));
//        FactorialUsingRecursion factorialUsingRecursion=new FactorialUsingRecursion();
//        System.out.println(factorialUsingRecursion.factorial(5));
//        HeadRecursion headRecursion=new HeadRecursion();
//        headRecursion.printCountingInReverseOrder(5);
//          TailRecursion tailRecursion=new TailRecursion();
//          tailRecursion.printCountingInIncreaseingOrder(5);
//          TreeRecursion treeRecursion=new TreeRecursion();
//          treeRecursion.printTreeRecursion(5);
//        CountStair count=new CountStair();
//        System.out.println(count.countStair(2));
//        SayNumber sayNumber=new SayNumber();
//        sayNumber.sayNumber(4210);
//        SumOfArrayUsingRecursion sumOfArrayUsingRecursion=new SumOfArrayUsingRecursion();
//        System.out.println(sumOfArrayUsingRecursion.sum(new int[]{1},1));
//        IsSortedOrNotShorted isSortedOrNotShorted=new IsSortedOrNotShorted();
//        if(isSortedOrNotShorted.isSortedOrNot(new int[]{},0)){
//            System.out.println("is sorted");
//        }else{
//            System.out.println("is not sorted");
//        }
//        LinearSearchByRecursion linearSearchByRecursion=new LinearSearchByRecursion();
//        if(linearSearchByRecursion.searchData(new int[]{},2,0)){
//            System.out.println("data are found");
//        }else{
//            System.out.println("data not found");
//        BinarySearchByRecursion binarySearchByRecursion=new BinarySearchByRecursion();
//        if(binarySearchByRecursion.binarySearch(new int[]{1},0,1,8)){
//            System.out.println("data are found");
//        }else{
//            System.out.println("data are not found");
//        }
        //int[] arr={2,1,4,6,3,6,7,4};
//        BubbleSortUsingRecursion bubbleSortUsingRecursion=new BubbleSortUsingRecursion();
//        bubbleSortUsingRecursion.bubbleSort(arr,arr.length-1);
//        QuickSortUsingRecursion quickSortUsingRecursion=new QuickSortUsingRecursion();
//        quickSortUsingRecursion.quickSort(arr,0,arr.length-1);
//        MargeSortUsingRecursion margeSortUsingRecursion=new MargeSortUsingRecursion();
//        MargeSortUsingRecursion.divideConquer(arr,0,arr.length-1);
//        for(int i=0;i<arr.length;i++)
//        System.out.print(arr[i]+" ");
//        LowerBoundIndex lowerBoundIndex=new LowerBoundIndex();
//        System.out.println(lowerBoundIndex.lowerBoundIndex(arr,arr.length-1,0,arr.length-1,4));
       // UpperBoundIndexing upperBoundIndexing=new UpperBoundIndexing();
        // System.out.println(upperBoundIndexing.upperBound(arr,arr.length,0,arr.length-1,4));
//        ReverseString str=new ReverseString();
//        System.out.println(str.reverseString("Welcome",0,6));
//        PailendromOfString pailendromOfString=new PailendromOfString();
//        if(pailendromOfString.isPailendrom("bookkoob",0,7)){
//            System.out.println("is pailendrom");
//        }else{
//            System.out.println("is not pailendrom");
//        }
//        PowerOfTwo power=new PowerOfTwo();
//        System.out.println(power.powerOfTwos(3,4));
        int[] nums={1,2,3};
        SubsetOfArray subsetOfArray=new SubsetOfArray();
       List<List<Integer>> arr=subsetOfArray.subsets(nums);
       for(int i=0;i<arr.size();i++){
           System.out.println(arr.get(i));
       }
    }
}