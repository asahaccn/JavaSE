
import java.util.Scanner ;
public class oddevencount {
    // count the odd numbers and even numbers within a range
    public static void  main(String[] args)
    {
          int low, high , even_count = 0 , odd_count = 0;
           Scanner obj = new Scanner(System.in);

          System.out.println("Enter The Low Limit");
           low = obj.nextInt();


          System.out.println("Enter The High Limit");
          high = obj.nextInt();
10

           for(int i = low ; i<=high ; i++)
           {
               if(i%2==0)
               {
                   even_count++ ;
               }
               else
               {
                   odd_count++ ;
               }
           }

        System.out.println("Even numbers in the range is : " +even_count);
        System.out.println("Odd numbers in the range is : " +odd_count);

    }
}