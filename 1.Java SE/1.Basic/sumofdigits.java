
import java.util.Scanner;
public class sumofdigits {

    // sum of digits : for example 123 = 1 + 2 + 3 = 6
    public static void main(String args[])
    {
        int number , remainder , sum = 0 , temp;
      
       Scanner obj = new Scanner(System.in);
       System.out.println("Enter the number");
       number = obj.nextInt();

        temp = number ;
       while(number>0)
       {
           remainder = number % 10 ;
           sum =  sum + remainder ;
           number = number / 10;
       }
       number = temp ;

          System.out.println("Sum Of digits in " +number+ " is " +sum);
      
    }
    
}