import java.util.Scanner ;

public class findfirstlastdigit {
    
    public static void main(String args[])
    {
        int number , first_digit , last_digit , sum_of_digits = 0 ;
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter The Number");
        number  = obj.nextInt();

        first_digit = number ;
        while(first_digit>=10)
        {
           first_digit = first_digit / 10 ;

        }
      last_digit = number % 10 ;

      System.out.println("First digit of the number is " +first_digit);

      System.out.println("Second digit of the number is " +last_digit);

        sum_of_digits = first_digit + last_digit ;
        System.out.println("Sum Of Digits In Number is " +sum_of_digits);
    }
}