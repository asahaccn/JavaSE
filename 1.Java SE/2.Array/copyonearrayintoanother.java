import java.util.Scanner ;

public class copyonearrayintoanother {
    
     // program to copy one array into
     public static void main(String[] args)
     {
         int i , j ,  size  ;
          Scanner obj = new Scanner(System.in);
   

        // Initialising the first array
     
        System.out.println("Enter The Size Of The Array :");
        size = obj.nextInt();
 
       int arr1[] = new int[size] ;
 
       System.out.println("Enter The Elements In The First Array");
      for(i =  0 ; i<arr1.length ; i++)
      {
      
          arr1[i] = obj.nextInt();
      }

 
     // declareing the second array
      int arr2[] = new int[size] ;
 
       
     
       // copying all the elements of the first array into second array
        for(i=0;i<arr1.length;i++)
        {
            arr2[i] = arr1[i] ;
        }
 
        System.out.println("Original Array Which Is The First Array");
        for(i =  0 ; i<size ; i++)
        {
            System.out.println(arr1[i]);
        }
        
 
           System.out.println("Array After Copying the elements of the first array that is second array : ");
           for(i =  0 ; i<arr2.length ; i++)
           {
               System.out.println(arr2[i]);
           }
      
     
       
 
 
     }
}