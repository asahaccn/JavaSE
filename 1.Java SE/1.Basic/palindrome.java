import java.util.Scanner ;

public class palindrome {

    // to check palindrome number
    public static void main(String args[])
    {
        int number , remainder , temp , sum = 0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter The Number");
        number = obj.nextInt();

        temp = number ;
        while(number>0)
        {
            remainder =  number %  10;
            sum = sum*10 +remainder ;
            number = number / 10 ;
        }
          number = temp ;

        if(sum==number)
         System.out.println(number+ " is palindrome number");
         else
         System.out.println(number+ " is not palindrome number");
    }
    
}