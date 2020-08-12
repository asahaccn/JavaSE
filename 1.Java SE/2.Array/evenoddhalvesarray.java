import java.util.Scanner ;

public class evenoddhalvesarray {
    
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


     System.out.println("Even Elements In The First Half Of The Array Are As Follows: ");

      for(i = 0 ; i<size/2 ; i++)
      {
         if(arr[i]%2==0)
         {
             System.out.println(arr[i]);
         }
     }

     System.out.println("Odd Elements In The Second Half Of The Array Are As Follows: ");

     for(i = size/2 ; i<size; i++)
     {
        if(arr[i]%2!=0)
        {
            System.out.println(arr[i]);
        }
    }


    }

}