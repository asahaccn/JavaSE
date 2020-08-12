
import java.util.Scanner ;
public class perfect {
    
    // to check strong number.
    public static void main(String[] args)
    {
        int number , temp ,  sum = 0;

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter The Number");
        number = obj.nextInt();

          temp =  number ;
          int i = 1;
         while(i<number)
         {
           if(number%i==0)
           {
               sum = sum + i ;
            
           }
           i++;
         }
         number = temp ;
         if(sum==number)
         System.out.println(number+ " is perfect number");
         else
         System.out.println(number+ " is not perfect number");

        }
}