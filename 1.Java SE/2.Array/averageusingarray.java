
import java .util.Scanner ;
public class averageusingarray {

    public static int Average(int a[] , int num)
    {
        int sum = 0 , avg ;

        for(int i = 0 ; i<num; i++)
        {
            sum = sum + a[i] ;

        }
        avg = sum / num ;
        return avg ;
      // return sum;

    }
    public static void main(String[] args)
    {
        int i ;
        Scanner obj = new Scanner(System.in) ;
        System.out.println("Enter The Size Of The Array");
        int size = obj.nextInt();

        int arr[] = new int[size] ;

        System.out.println("Enter The Elements In The Array");
        for( i = 0 ; i<size;i++)
        {
            arr[i] = obj.nextInt();
        }
       

        int result =  Average(arr,size);
        System.out.println("Average oF The Array Elements Is : " + result);
        //System.out.println("Sum Of Array Elements Is  : " + result);
    }
    
}