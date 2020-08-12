
import java.util.Scanner ;
public class AscendingDescendingTogether {
    

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

            System.out.println("Entered Elements In The Array are as follows");
            for(i=0 ; i<arr.length;i++)
            {
                     System.out.println(arr[i]) ;
            }
      

        for(i = 0 ; i<size/2 ; i++)
        {
            for(j = i+1 ; j<size/2 ; j++)
            {
                if(arr[i]>arr[j])
                {
                    temp = arr[i] ;
                    arr[i] = arr[j] ;
                    arr[j] = temp ;
                }
            }
            
          
        }

        for(i = size/2 ; i<size ; i++)
        {
            for(j = i+1 ; j<size ; j++)
            {
                if(arr[i]<arr[j])
                {
                    temp = arr[i] ;
                    arr[i] = arr[j] ;
                    arr[j] = temp ;
                }
            }
            
          
        }

        System.out.println("Elements in the First half of Array In Ascending Order Are : ");
        for(i=0;i<size/2;i++)
        {
            System.out.println(arr[i]);
        }
        
    System.out.println("Elements in the Second half of Array In Descending Order Are : ");
        for(i=size/2;i<size;i++)
        {
            System.out.println(arr[i]);

    }
    }
}