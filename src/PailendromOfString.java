public class PailendromOfString {
    public static boolean isPailendrom(String str,int i,int j){
        if(i>j){
            return true;
        }
        if(str.charAt(i) != str.charAt(j))
              return false;
        return isPailendrom(str,i+1,j-1);
    }
}
