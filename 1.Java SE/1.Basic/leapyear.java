
import java.util.Scanner ;

public class leapyear {

    //leap year
    public static void main(String args[])
    {
        int year ;
        Scanner obj = new Scanner(System.in);
       System.out.println("Enter a year");
       year = obj.nextInt();

       if(((year%4==0)&&(year%100!=0)) || (year%400==0))
        System.out.println(year+ " is Leap Year");
        
        else 
        System.out.println(year+  " is Normal Year");
       
     

    }
    
}