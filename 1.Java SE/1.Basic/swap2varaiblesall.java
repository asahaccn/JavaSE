
import java.util.Scanner;


public class swap2varaiblesall {
    
   // swap using 2 variables
    public static void main(String[] args)
    {
        int temp , num1 , num2 ;
    
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter The First Number");
        num1 = obj.nextInt();

        System.out.println("Enter The Second Number");
        num2 = obj.nextInt();

       /* System.out.println("Value of num1 before swapping is " +num1+ " and value of num2 before swapping is " +num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("Value of num1 after swapping is " +num1+ " and value of num2 after swapping is " +num2);*/
        

       /* System.out.println("Value of num1 before swapping is " +num1+ " and value of num2 before swapping is " +num2);
        num1 = num1 * num2;
        num2 = num1 / num2;
        num1 = num1 / num2;

        System.out.println("Value of num1 after swapping is " +num1+ " and value of num2 after swapping is " +num2);*/


        System.out.println("Value of num1 before swapping is " +num1+ " and value of num2 before swapping is " +num2);
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;

        System.out.println("Value of num1 after swapping is " +num1+ " and value of num2 after swapping is " +num2);

    }
    
}