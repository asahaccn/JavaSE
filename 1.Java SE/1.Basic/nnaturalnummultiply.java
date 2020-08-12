
import java.util.Scanner ;

public class nnaturalnummultiply {
    
    public static void main(String[] args)
    {
        int number , multi = 1;
        Scanner obj = new Scanner(System.in);
       
          System.out.println("Enter a number");
          number =  obj.nextInt();
          for(int i=1;i<=number;i++)
          {
              multi = multi * i ;
          }
        System.out.println("Sum of number upto " + number + " is "  +multi);
    }
    
}
