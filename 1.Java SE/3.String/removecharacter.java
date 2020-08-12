
import java.util.Scanner ;
public class removecharacter {
    
    public static void main(String[] args)
    {

        String original_sentence ;
        Scanner obj = new Scanner(System.in);

       System.out.println("Enter The String");
       original_sentence = obj.nextLine();

       System.out.println("String After Removal of character " +RemoveCharat(original_sentence,3));

    }

    public static String RemoveCharat(String s , int position )
    {
        return s.substring(0,1) + s.substring(position+1);
    }
}