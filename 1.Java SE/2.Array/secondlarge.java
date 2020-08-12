import java.util.Scanner ;

public class secondlarge {

    // find the second largest element in the array
    public static void main(String[] args)
    {
        int i , size , large , s_large ;
         Scanner obj = new Scanner(System.in);
 
      System.out.println("Enter The Size Of The Array");
      size = obj.nextInt();

      int arr[] = new int[size] ;

     System.out.println("Enter The Elements In The Array");
     for(i =  0 ; i<size ; i++)
     {
         arr[i] = obj.nextInt();
     }

      large = s_large = arr[0] ;
      for(i =  0 ; i<size ; i++)
      {
            if(large<arr[i])
            {
               s_large = large ; 
               large = arr[i] ;
 
            }
            else if(s_large<arr[i] && large !=arr[i])
            {
               s_large = arr[i] ;
            }
          }
     
    
       System.out.println("Largest Element In The Array Is : " +large);
       System.out.println("Second Largest Element In The Array Is : " +s_large);



    }

    
}