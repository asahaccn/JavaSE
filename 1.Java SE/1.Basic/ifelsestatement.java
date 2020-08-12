public class ifelsestatement {

    // IF ELSE STATEMENT // Understanding IF ELSE through Odd even , leap year and ternary operator.
    public static void main(String[] args)
    {

        // Example 1 through odd even check
        /*  int num = 15 ;

          if(num%2==0)
          {
              System.out.println(num+ " Is Even");
          }
          else 
              System.out.println(num+ " Is Odd"); */

              // Example 2 through leap year check

       /*  int year = 2020 ;

         if(((year%4==0) && (year%100!=0)) || (year%400==0))
            System.out.println(year+ " is a Leap Year");
            else
            System.out.println(year+ " is normal Year"); */

            // Example 3 through Ternary operator.

              int number = 10 ;

              String result = (number%2==0) ? "Even number" : "Odd number" ;
              System.out.print(result);


    }
    
}