
import java.util.Scanner;
public class fibonacci {

    //  fibonacci number

public static void main(String[] args)
{
    int a = 0, b = 1, c , range;
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter The Range");
    range = obj.nextInt();
   
    for(int i = 0 ; i<range ; i++)
    {
        System.out.println("Fibbonaci numbers within " +range+ " are " +a);
        c = a+b ;
        a = b;
        b = c ;
    }
   

}
    
}