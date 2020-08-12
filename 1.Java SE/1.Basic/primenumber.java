
import java.util.Scanner;
public class primenumber {
     // program to check prime number

     public static void main(String[] args)
     {
        int number , flag = 0 , temp ;
         Scanner obj = new Scanner(System.in);
         System.out.println();
         System.out.println("Enter The Number");
         number = obj.nextInt();

            temp = number ;
         for(int i=2;i<=number/2;i++)
         {
           if(number%i==0)
           {
               flag = 1;
               break ;
           }
        }
           number = temp ;
           if(number==1)
           System.out.println(number+ "is composite number");

           if(flag==0)
               System.out.println(number+ " is prime number");
        
           else
            System.out.println(number+ " is not prime number");
         }

     }
