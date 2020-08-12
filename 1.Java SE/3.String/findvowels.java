import java.util.Scanner ;

public class findvowels {

    // take the user input and find if there is any vowel if vowel exist delete it

    public static void main(String[] args)
    {

        String str ;
        int i  ;
        Scanner obj = new Scanner(System.in);

       System.out.println("Enter The String");
       str = obj.nextLine();

      System.out.println("Original String Is :" +str);
       
      for(i = 0 ; i<str.length();i++)
      {
       char  ch = str.charAt(i);
            switch(ch)
            {
             case  'a' :
             case 'e'  :
             case 'i'   :
             case 'o'  :
             case 'u'  :
             case  'A' :
             case 'E'  :
             case 'I'   :
             case 'O'  :	
             case 'U'  :
             i=1;
                System.out.println(ch); 			 
            }	
            }
            if(i==0)
                System.out.println("There are no vowels in a string"); 
            
         }
      }

    
    
