public class PowerOfTwo {
    public static int powerOfTwos(int a,int b){
        if(b==0)
            return 1;
        if(b==1)
            return a;
        int ans=powerOfTwos(a,b/2);
        if((b&1)==0)
            return ans*ans;
        else
            return a*ans*ans;
    }
}
