import java.util.Scanner ;

public class factoraialrecursive {

    public static int Factorial(int n)
    {
        if(n==0)
        return 1 ;
        else
        return (n * Factorial(n-1)) ;
}
      //  factoraial of a number using recursive method.
    public static void main(String [] args)
    {
        int number , fact;
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a number");
        number = obj.nextInt();

         fact = Factorial(number);
        System.out.println("Factorial of " +number+ " is " +fact);

    }
    
}