public class TreeRecursion {
    public static void printTreeRecursion(int x){
        if(x==0)
            return;
        System.out.print(x+" ");
        printTreeRecursion(x-1);
        System.out.print(x +" ");;
    }
}
