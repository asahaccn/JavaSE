
import java.util.Scanner ;
public class swappingadjacent {

    // SWAPPING AJACENT ELEMENT IN THE ARRAY
    public static void main(String[] args)
    {
        int i , size , temp ;
         Scanner obj = new Scanner(System.in);
 
      System.out.println("Enter The Size Of The Array");
      size = obj.nextInt();

      if(size%2!=0)
      {
         System.out.println("Please Enter Even Number Of Elements In The Array: ");
          return ;
      }

      int arr[] = new int[size] ;

     System.out.println("Enter The Elements In The Array");
     for(i =  0 ; i<size ; i++)
     {
         arr[i] = obj.nextInt();
     }

    
     
     
     System.out.println("Original Array");
     for(i=0;i<size;i++)
     {
         System.out.println(arr[i]);
     }
     
       for(i=0;i<size-1;i+=2)
       {
           temp = arr[i] ;
           arr[i] = arr[i+1]  ;
           arr[i+1] = temp ;
       }
      
       System.out.println("Array After Swapping Adjacent Element: ");
       for(i=0;i<size;i++)
       {
           System.out.println(arr[i]);
       }
    
       


    }

}