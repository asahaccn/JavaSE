import java.util.Scanner ;

public class descendingelements {
    
    public static void main(String[] args)
    {
        int i , j , temp , size ;
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter The Size Of The Array :");
        size = obj.nextInt();
 
        int arr[] = new int[size] ;

        System.out.println("Enter The Elements In The Array: ");
        for(i = 0 ; i<size ; i++)
        {
            arr[i] = obj.nextInt();
        }


        for(i = 0 ; i<size ; i++)
        {
            System.out.println("Elements In The Array Before Arrangeing Them In Descending Order: " +arr[i]);
      
        }
          

        for(i = 0 ; i<arr.length ; i++)
        {
            for(j = i+1 ; j<arr.length ; j++)
            {
                if(arr[i]<arr[j])
                {
                    temp = arr[i] ;
                    arr[i] = arr[j] ;
                    arr[j] = temp ;
                }
            }
            
          
        }
          

        for(i = 0 ; i<arr.length ; i++)
        {
            System.out.println("Elements In The Array After Arrangeing Them In Descending Order: " +arr[i]);
      
        }
          

    }
}