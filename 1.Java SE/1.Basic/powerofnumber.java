import java.util.Scanner;

public class powerofnumber {

    // find the power of the number
    public static void main(String[] args)
    {


        int power=1 , exponent = 1 , number ;
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter The Number");
        number = obj.nextInt();

        for(int i = 1 ; i<=exponent ; i++)
        {
            power = power * number ;
        }
        System.out.println("The Final Result of " + number + " power "  + exponent + " = " + power);
    }

    }
    
