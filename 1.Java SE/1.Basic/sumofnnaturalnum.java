
import java.util.Scanner ;

public class sumofnnaturalnum {

// sum of natural number
    public static void main(String[] args)
    {
        int number , sum = 0;
        Scanner obj = new Scanner(System.in);
       
          System.out.println("Enter a number");
          number =  obj.nextInt();
          for(int i=1;i<=number;i++)
          {
              sum = sum + i ;
          }
        System.out.println("Sum of number upto " + number + " is "  +sum);
    }
    
}