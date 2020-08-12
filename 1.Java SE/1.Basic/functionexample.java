
import java.util.Scanner;
public class functionexample {

    public static int func(int a , int b)
    {
        int min ;
        if(a>b)
        min = b;
        else
        min = a ;
        return min ;
    }
    public static void main(String[] args)
    {
        int num1 , num2 , minimum;
       Scanner obj = new Scanner(System.in);

       System.out.println("Enter The First Number");
       num1 = obj.nextInt();

       System.out.println("Enter The Second Number");
       num2 = obj.nextInt();

       minimum = func(num1,num2);
       System.out.println("Minimum between " +num1+ " and " +num2+ " is " +minimum);



    }
    
}