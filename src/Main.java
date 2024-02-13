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
        int[] arr={1,2,3,4,5,6,7};
//        LowerBoundIndex lowerBoundIndex=new LowerBoundIndex();
//        System.out.println(lowerBoundIndex.lowerBoundIndex(arr,arr.length-1,0,arr.length-1,4));
        UpperBoundIndexing upperBoundIndexing=new UpperBoundIndexing();
        System.out.println(upperBoundIndexing.upperBound(arr,arr.length,0,arr.length-1,4));
    }
}