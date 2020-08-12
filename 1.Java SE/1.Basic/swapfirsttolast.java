
import java.util.Scanner;
public class swapfirsttolast {

    public static void main(String[] args)
    {
        int number , first_digit , last_digit , swapped;
       Scanner obj = new Scanner(System.in);

       System.out.println("Enter The number");
       number = obj.nextInt();

       System.out.println("Before Swapping Number is " +number);
     
       first_digit = number / 10 ;
       last_digit = number %10 ;
       swapped =  (last_digit * 10) + first_digit;

       System.out.println("Swapped number is " +swapped);


    }
    
}