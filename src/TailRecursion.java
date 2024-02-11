public class TailRecursion {
    public static void printCountingInIncreaseingOrder(int x){
        if(x==0)
            return;
        printCountingInIncreaseingOrder(x-1);
        System.out.print(x +" ");
    }
}
