
import java.util.Scanner ;


public class oddevencheck {


    
    // Odd Even Number Check
    public static void main(String[] args)
    {
        int number ;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number");
        number = obj.nextInt();

        if(number%2==0)
        {
            System.out.println(number+ " is even");
        }

        else 
         {
            System.out.println(number+ " is odd");
         }
    }
}