
import java.util.Scanner ;
public class gcd2nos {
    
    // find the gcd of 2 numbers (hcf of 2 numbers)
    public static void main(String[] args)
    {
        int num1,num2, gcd = 1 ;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter The First Number");
        num1 = obj.nextInt();

        System.out.println("Enter The Second Number");
        num2 = obj.nextInt();

        for(int i=1;i<=num1 && i<num2;i++)
        {
             gcd = i ;
        }
        System.out.println("Gcd Of " +num1+ " and "  +num2+ " is " +gcd);
    }
}