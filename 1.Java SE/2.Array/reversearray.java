import java.util.Scanner ;
public class reversearray {
    
    // program to reverse a array 
    public static void main(String[] args)
    {
        int i , j ,  size , temp ;
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

       
        j = i-1 ; // j is set to last element
        i = 0 ; // i is set to first element 

          
       /* while(i<j)
        {
            temp = arr[i] ;
            arr[i] = arr[j];
            arr[j] = temp  ;

            i++ ;
            j-- ;
        }*/

        for(i=0;i<j;i++,j--)
        {
            temp = arr[i] ;
            arr[i] = arr[j];
            arr[j] = temp  ;
        }


          System.out.println("Array After Shifting : ");
          for(i =  0 ; i<size ; i++)
          {
              System.out.println(arr[i]);
          }
     
    
      


    }
      
}