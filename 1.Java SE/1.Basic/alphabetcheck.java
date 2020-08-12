
import java.util.Scanner;
public class alphabetcheck {

    public static void main(String[] args)
    {
        char c ;
        Scanner obj = new Scanner(System.in);
       
        System.out.println("Enter The Character");
        c = obj.next().charAt(0);
        if((c>='a' && c<='z') || (c>='A' && c<='Z'))
        {
            System.out.println(c+ " is a alphabet");
        }
        
       else
      {
        System.out.println(c+ " is not a alphabet");
      }
    }
    
}