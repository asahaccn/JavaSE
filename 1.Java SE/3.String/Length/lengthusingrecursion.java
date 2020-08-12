
import java.util.Scanner ;


public class lengthusingrecursion {

    // length of the string using with out using build in function.
    public static int length(String str)
	{
		if(str.equals(""))
		{
			return 0 ;
		}
		
		else
		{
			return length (str.substring(1)) + 1 ;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ;
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter The String");
		s = obj.nextLine();
		
		obj.close();
		
		System.out.println("The Length Of The String Is : " + length(s));
        
    }
}