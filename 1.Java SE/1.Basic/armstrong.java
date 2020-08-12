
import java.util.Scanner ;
public class armstrong {
    
    public static void main(String[] args)
    {
      int number , remainder , c , sum = 0 , temp ;
      Scanner obj = new Scanner(System.in);

      System.out.println("Enter The Number");
      number =  obj.nextInt();

      temp = number ;
      while(number>0)
      {
          
          remainder = number % 10 ;
          c = remainder * remainder * remainder ;
          sum =  sum + c ;
          number = number / 10 ;
      }
      number = temp ;
      
      if(sum==number)
      System.out.println(+number+ " is Armstrong number");
      else 
      System.out.println(+number+ " is not Armstrong number");
    }
}