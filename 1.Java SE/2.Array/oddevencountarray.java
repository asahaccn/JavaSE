import java.util.Scanner ;

public class oddevencountarray {

    public static void main(String[] args)
    {
        int i , size ,  even_count = 0 , odd_count = 0  ;
         Scanner obj = new Scanner(System.in);
 
      System.out.println("Enter The Size Of The Array");
      size = obj.nextInt();

      int arr[] = new int[size] ;

     System.out.println("Enter The Elements In The Array");
     for(i =  0 ; i<size ; i++)
     {
         arr[i] = obj.nextInt();
     }

      for(i = 0 ; i<arr.length ; i++)
      {
         if(i%2==0)
         {
             even_count++;
         }
         else
         {
           odd_count++;
         }

         
      }
        System.out.println("Even Elements In THE Array are : " +even_count);
         System.out.println("Odd Elements In THE Array are : " +odd_count);


    }
    
}