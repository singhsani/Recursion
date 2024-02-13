public class CountStair {
    public static int countStair(int n){
        if(n<0)
            return 0;
        if(n==0)
            return 1;
        return countStair(n-1)+countStair(n-2);
    }
}
