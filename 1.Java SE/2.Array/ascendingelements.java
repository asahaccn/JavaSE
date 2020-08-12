import java.util.Scanner ;

public class ascendingelements {


    public static void main(String[] args)
    {
        int i , j , temp,  size  ;
         Scanner obj = new Scanner(System.in);
 
      System.out.println("Enter The Size Of The Array");
      size = obj.nextInt();

      int arr[] = new int[size] ;

      System.out.println("Enter the Elements In The Array:");
      for(i =  0 ; i<size ; i++)
      {
          arr[i] = obj.nextInt();
      }

     
     for(i =  0 ; i<size ; i++)
     {
        System.out.println("Elements In The Array Before Arrangeing Them In Ascending order :" +arr[i]);
     }



     for(i =  0 ; i<size ; i++)
     {
         for(j = i+1 ; j<size ; j++)
         {
           if(arr[i]>arr[j])
           {
               temp  = arr[j] ;
               arr[j] = arr[i]  ;
               arr[i] = temp ;

           }
         }
    
     }


     System.out.println("Elements In The Array After Arrangeing Them In Ascending Order : ");

      for(i = 0 ; i<arr.length ; i++)
      { 
        
         System.out.println(arr[i]);
     }

    

    }
}