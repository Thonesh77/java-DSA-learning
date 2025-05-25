import java.util.Scanner;

public class countNum {

  public static void main(String[] var0) {
      int  count = 0 ;
       int n = 754584;
       while (n > 0) 
       {
   int rem  = n % 10 ;
    if(rem == 5){
      count++;
    }
        n = n / 10;
        }
}
;