import java.util.Scanner ;

// if vowels exists in the string remove it.
public class removevowel {
    public static void main(String[] args)
    {

        String original_sentence ;
        Scanner obj = new Scanner(System.in);

       System.out.println("Enter The String");
       original_sentence = obj.nextLine();

       String new_sentence =  original_sentence.replaceAll("[AEIOUaeiou]", "");
       System.out.println("New String :" +new_sentence);

    }
    
}