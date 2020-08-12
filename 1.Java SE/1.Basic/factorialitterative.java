
import java.util.Scanner;

public class factorialitterative {

    // Factorial of a number 
    public static void main(String args[])
    {

        int number , fact = 1;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number");
        number = obj.nextInt();

        for(int i=1;i<=number;i++)
        {
            fact = fact * i ;
        }
         System.out.println("Factorial of " + number + " is " +fact);
    }
    

    
}