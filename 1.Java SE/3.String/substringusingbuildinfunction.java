
    
    import java.util.Scanner;

public class substringusingbuildinfunction {

	public static void main(String[] args) {
		
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter The String : "); // Hello World
		
		String s = obj.nextLine();
		obj.close();
		
	
		
		String sub = s.substring(6); 
		System.out.println("Hello World " + sub); // World
		
		System.out.println("Hello World".substring(1));  //  ello // another way.
		

	}

}

