import java.util.Scanner ;

public class smallest {
    

    public static void main(String[] args)
    {
        int i , size , small , temp;
         Scanner obj = new Scanner(System.in);
 
      System.out.println("Enter The Size Of The Array");
      size = obj.nextInt();

      int arr[] = new int[size] ;

     System.out.println("Enter The Elements In The Array");
     for(i =  0 ; i<size ; i++)
     {
         arr[i] = obj.nextInt();
     }

      small = arr[0] ;
      for(i =  0 ; i<size ; i++)
      {
            if(small>arr[i])
            {
               small = arr[i] ;
 
            }
          }
     
    
     
      System.out.println("Smallest Element In The Array Is : " +small);


    }
    
}