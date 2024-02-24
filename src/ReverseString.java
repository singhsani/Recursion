import java.util.Arrays;

public class ReverseString {
    public static String reverseString(String str,int i,int j){
        if(i>j)
            return str;
        char[] ch=str.toCharArray();
        char c=ch[j];
        ch[j]=ch[i];
        ch[i]=c;
       return reverseString(new String(ch),i+1,j-1);
    }
}
