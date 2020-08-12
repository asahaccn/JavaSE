import java.util.Scanner ;

public class leftshift {
    
    // shifting elements leftwise in the array
    public static void main(String[] args)
    {
        int i , size , temp ;
         Scanner obj = new Scanner(System.in);
 
      System.out.println("Enter The Size Of The Array");
      size = obj.nextInt();

      int array[] = new int[size] ;

      System.out.println("Enter The Elements In The Array");
     for(i =  0 ; i<size ; i++)
     {
     
         array[i] = obj.nextInt();
     }


    
     System.out.println("Original Array");
     for(i=0;i<size;i++)
     {
         System.out.println(array[i]);
     }
     
     
     
         temp = array[0];
         for( i =0 ; i<size-1 ; i++)
         {
             array[i] = array[i+1];
         }
         array[size-1] = temp ;
         
         
         System.out.println("Array Elements After Left Shift : ");
         for(i=0;i<size;i++)
         {
             System.out.println(array[i]);
         }

    }
}