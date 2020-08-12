
import java.util.Scanner;
public class strong {
    
    // program to check strong number.
    public static void main(String args[])
    {
        int remainder , number , temp , sum = 0 ,  fact = 1;
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the number ");
        number = obj.nextInt();

        temp = number ;
        while(number>0)
        {
            remainder =  number % 10 ;
            fact = 1 ;
            for(int i = 1 ; i<=remainder ; i++)
            {
                fact = fact * i;
            }

            sum = sum + fact ;
            number = number / 10 ;

        }
        number = temp ;
        if(sum==number)
        System.out.println(number+ " is Strong number");
        else
        System.out.println(number+ " is not Strong number");


    }
}