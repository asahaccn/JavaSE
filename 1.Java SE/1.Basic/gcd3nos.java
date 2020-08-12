
import java.util.Scanner ;
public class gcd3nos {

    // gcd of 3 numbers
    public static void main(String[] args)
    {
        int a,b,c , st , gcd = 1;
      Scanner  obj = new Scanner(System.in);

      System.out.println("Enter the first number");
      a  = obj.nextInt();

      System.out.println("Enter the Second number");
      b = obj.nextInt();

      System.out.println("Enter the Third number");
      c  = obj.nextInt();

      st = a>b ? (a>c ? a:c) : (b>c ? b:c) ;
      for(gcd=st ; gcd>=1 ; gcd--)
      {
          if(a%gcd==0 && b%gcd==0 && c%gcd==0)
          break ;
      }
      System.out.println("Gcd Of 3 Numbers Is : " + gcd );
    }
    
}