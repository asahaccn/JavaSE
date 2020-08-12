import java.util.Scanner ;

public class pairsumarray {
    // given a number find the number among adding all numbers in the array.
    public static void main(String[] args)
    {
        int i , j , size , number ;
         Scanner obj = new Scanner(System.in);
 
      System.out.println("Enter The Size Of The Array");
      size = obj.nextInt();

      int arr[] = new int[size] ;

     System.out.println("Enter The Elements In The Array");
     for(i =  0 ; i<size ; i++)
     {
         arr[i] = obj.nextInt();
     }

     System.out.println("Enter The Number To Be Found In Array In Pair");
     number = obj.nextInt();


     for(i = 0; i < arr.length ; i++){
        int first = arr[i];
        for( j = i +1 ; j < arr.length; j++){
         int second = arr[j];
         if(first+second == number){
          System.out.println("("+first+","+second+")");
         }
        }
       }
      }

    }
    
