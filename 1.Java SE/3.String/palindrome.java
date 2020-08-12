
import java.util.Scanner ;


public class palindrome {
    
    // string is palindrome or not .
    public static void main(String[] args)
    {
        String str , reverse = ""  ;
    
        Scanner obj = new Scanner(System.in);
    
         System.out.println("Enter a string : ") ;
         str = obj.nextLine();
     
    
         int length = str.length();
    
        for(int i=length-1 ; i>=0 ; i--)
          {
              reverse = reverse + str.charAt(i);
           }
    
    
           if(str.equals(reverse))
             System.out.println(str +  " is a palindrome number " ) ;
             else 
              System.out.println(str +  " is not a palindrome number " ) ;
        }
    
    }
