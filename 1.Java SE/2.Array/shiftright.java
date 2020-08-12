import java.util.Scanner ;

public class shiftright {
    
    // right shift array element 
    public static void main(String[] args)
    {
        int i , size , temp ;
         Scanner obj = new Scanner(System.in);
 
      System.out.println("Enter The Size Of The Array");
      size = obj.nextInt();

      int arr[] = new int[size] ;

      System.out.println("Enter The Elements In The Array");
     for(i =  0 ; i<size ; i++)
     {
     
         arr[i] = obj.nextInt();
     }


      
     System.out.println("Original Array");
     for(i =  0 ; i<size ; i++)
     {
         System.out.println(arr[i]);
     }


           temp = arr[size - 1] ;
      for(i = size-1 ; i>0 ; i--)
      {
            arr[i] = arr[i-1];
      }
         arr[0] =  temp ;

          System.out.println("Array After Shifting : ");
          for(i =  0 ; i<size ; i++)
          {
              System.out.println(arr[i]);
          }
     
    
      


    }

}