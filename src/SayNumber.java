import java.util.ArrayList;

public class SayNumber {
    public static String[] number = {"zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public static void sayNumber(int x){
        if(x==0)
            return;
        int digit=x%10;
        sayNumber(x/10);
        System.out.print(number[digit]+" ");
    }
}
