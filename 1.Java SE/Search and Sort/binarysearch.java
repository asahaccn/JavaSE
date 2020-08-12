
import java.util.Scanner ;

public class binarysearch {
    
    // binary search 

    public static void main(String[] args)
 {
     int i , size , element , loctemp ;
      Scanner obj = new Scanner(System.in);

   System.out.println("Enter The Size Of The Array");
   size = obj.nextInt();

   int array[] = new int[size] ;

   System.out.println("Enter The Elements In The Array");
  for(i =  0 ; i<size ; i++)
  {
  
      array[i] = obj.nextInt();
  }

  System.out.println("Enter The Element To Be Searched In The Array");
  element = obj.nextInt();

   int left = 0  ;
   int right = size - 1 ;
   int mid = (left+right) / 2 ;

   while(left<=right)
   {
       if(array[mid]<element)
       {
          left = mid + 1 ;
       }
       else if(array[mid]==element)
       {
            System.out.println(element+ " found at " +(mid+1)+ " position");
            break ;
       }

       else 
           right = mid - 1 ;

        mid = (left + right) /2;
   }


   if(left>right) 
   {
    System.out.println(element+ " not found at any position");
   }

}

}