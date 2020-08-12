import java.util.Scanner ;

public class lcm {

    // find the lcm and gcd/hcf of a number
    public static void main(String[] args)
    {
        int num1 , num2 , lcm, gcd = 1;
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter The First Number");
        num1 = obj.nextInt();

        System.out.println("Enter The Second Number");
        num2 = obj.nextInt();

        for(int i = 1 ; i<=num1 && i<num2 ; i++)
        {
            gcd = i ;
        }
        System.out.println("HCF/GCD Of " +num1+ " and  " +num2+ " is " +gcd);
        lcm =  (num1 * num2)/gcd ;
        System.out.println("Lcm Of " +num1+ " and  " +num2+ " is " +lcm);

        


    }
    
}