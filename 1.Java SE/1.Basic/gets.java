import java.util.Scanner;

public class gets {
    
    public static void main(String[] args)
    {
       char sh[50] ;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter String");
        gets(str); // GETS IS BETTER IN C THAN SCANF AS IT TAKES THE COMPLETE STRING HELLO WORLD THAN ONLY HELLO 
        // IN CASE OF PRINTF IT IGNORES THE STRING AFTER SPACE BUT GETS DOESNOT IGNORE IT

       // String sh = obj.nextLine();
        System.out.println("Entered String is : " +sh);

    }
}