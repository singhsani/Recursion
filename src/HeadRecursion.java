public class HeadRecursion {
    public static void printCountingInReverseOrder(int x){
        if(x==0){
            return;
        }
        System.out.print(x + " ");
        printCountingInReverseOrder(x-1);
    }
}
