
import java.util.Scanner;
public class averagefunc {

// java program to find average of two numbers using function.
 public static float Average(int a , int b)
 {
     return (float)(a+b)/2;
 }
    public static void main(String[] args)
    {
         int num1 , num2 ;
         float avg;
         Scanner obj =  new Scanner(System.in);
         System.out.println("Enter The First Number");
         num1 = obj.nextInt();

         System.out.println("Enter The Second Number");
         num2 = obj.nextInt();

         avg = Average(num1,num2);
         System.out.println("Average of " +num1+ " and " +num2+ " is "  +avg);
         

         


    }
    
}