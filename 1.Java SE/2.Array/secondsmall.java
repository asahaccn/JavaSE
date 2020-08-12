import java.util.Scanner ;

public class secondsmall {
    
    // find the second smallest element in the array
    public static void main(String[] args)
    {
        int i , size , small , s_small ,temp;
         Scanner obj = new Scanner(System.in);
 
      System.out.println("Enter The Size Of The Array");
      size = obj.nextInt();

      int arr[] = new int[size] ;

     System.out.println("Enter The Elements In The Array");
     for(i =  0 ; i<size ; i++)
     {
         arr[i] = obj.nextInt();
     }

      small = s_small = arr[0] ;
      for(i =  0 ; i<size ; i++)
      {
            if(small>arr[i])
            {
               s_small = small ; 
               small = arr[i] ;
 
            }
            else if(s_small>arr[i] && small !=arr[i])
            {
               s_small = arr[i] ;
            }
          }
     
    
       System.out.println("Smallest Element In The Array Is : " +small);
       System.out.println("Second smallest Element In The Array Is : " +s_small);



    }

}