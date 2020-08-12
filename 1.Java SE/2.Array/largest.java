import java.util.Scanner ;

public class largest {
    
    public static void main(String[] args)
    {
        int i , size , large , temp;
         Scanner obj = new Scanner(System.in);
 
      System.out.println("Enter The Size Of The Array");
      size = obj.nextInt();

      int arr[] = new int[size] ;

     System.out.println("Enter The Elements In The Array");
     for(i =  0 ; i<size ; i++)
     {
         arr[i] = obj.nextInt();
     }

      large = arr[0] ;
      for(i =  0 ; i<size ; i++)
      {
            if(large<arr[i])
            {
               large = arr[i] ;
 
            }
          }
     
    
     
      System.out.println("Largest Element In The Array Is : " +large);


    }
    
}