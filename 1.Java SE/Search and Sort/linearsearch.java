 import java.util.Scanner ;
 public class linearsearch
 {
 
 public static void main(String[] args)
 {
     int i , size , element ;
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

  for(i=0 ; i<array.length;i++)
  {
     if(array[i] == element)
     {
         System.out.println(element+ " Found At " +(i+1)+  " position");
         break ;
     }
     
    }
    if(i == size)
    {
        System.out.println(element+ " Not Found In The Array " );
    }
        
     }
      
     }
  
 

 

    