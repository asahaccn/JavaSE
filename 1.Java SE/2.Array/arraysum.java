
import java.util.Scanner ;

public class arraysum {

    public static void main(String[] args)
    {
        int sum = 0 , i ;
        Scanner obj = new Scanner(System.in);

         System.out.println("Enter The Size Of The Array");
         int size = obj.nextInt();

         int arr[] = new int[size] ;

         System.out.println("Enter The Elements In The Array");
         for( i = 0 ; i<size;i++)
         {
             arr[i] = obj.nextInt();
         }

       

        for( i = 0 ; i<arr.length ; i++)
        {
            sum = sum + arr[i] ;
        }
        System.out.println("The Addition Of Elements In The Array is : " +sum);
    }
    
}