
import java.util.Scanner;


public class primerange {



//prime number range


	public static void main(String[] args) {

		
		int i , start , end , flag = 0 ;
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter Start Value");
		start = obj.nextInt();
		
		
		System.out.println("Enter End Value");
		end = obj.nextInt();
		System.out.println("Prime Numbers Between " + start + " and " + end + " are : ");
		
		
		while(start<end)
		{
			flag = 0 ;
			
		   for(i=2 ; i<=start/2;++i)
		   {
			if(start%i==0)
			{
				flag = 1 ;
				break ;
			}
		}
		
		 
		   if(flag==0)
			 System.out.println(+start+  " ");
		  ++start;
		}
	}
}
		   
		
		
    
