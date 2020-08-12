
import java.util.StringTokenizer ;
public class stringtokenizerclass {
    
    public static void main(String[] args)
    {
        // the java.util.StringTokenizer class is used to divide the string into tokens

        // Let's see the simple example of StringTokenizer class that tokenizes a string 
        // "my name is khan" on the basis of whitespace.

         StringTokenizer st = new StringTokenizer("my name is khan");

         while(st.hasMoreTokens())

         {
           System.out.println(st.nextToken());
         }

    }
}