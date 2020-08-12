
import java.util.Scanner ;

public class takeinguserinput {

    // all types of user input.
    public static void main(String[] args)
    {
        int i ;
        float f ;
        double d ;
       String s ;
       char c;

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter The integer value");
        i = obj.nextInt();
        System.out.println("Entered integer value is " +i);

        System.out.println("Enter The float value");
        f = obj.nextFloat();
        System.out.println("Entered float value is " +f);

        System.out.println("Enter The double value");
        d = obj.nextDouble();
        System.out.println("Entered double value is " +d);

       System.out.println("Enter The String");
        s = obj.nextLine();
        System.out.println("Entered string  is " +s);

        System.out.println("Enter The String");
        c = obj.next().charAt(2);
        System.out.println("Entered string  is " +c);

      

    }
    
}