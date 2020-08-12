import java.util.Scanner ;

public class lengthusingbuildin
{
    // length of a string using build in function
   public static void main(String[] args)
   {
       String str   ;
       Scanner obj = new Scanner(System.in);
       
      System.out.println("Enter The String");
       str = obj.nextLine();

         int i = 0;
       for(char c  : str.toCharArray()) // convert the string into character array which has same length as the length of 
       // the string.
       {
          i++;
       }

    
       System.out.println("Length Of String  " +str+ " is " +i);
   }
}