import java.util.Scanner ;



public class stringcompbuildin {
    
    // program to compare two string using build in function
   public static void main(String[] args)
   {
       Scanner obj = new Scanner(System.in);

       System.out.println("Enter The First String: ");
       String s1 = obj.nextLine();


       System.out.println("Enter The Second String: ");
       String s2 = obj.nextLine();

       if(s1.compareTo(s2)<0)
       System.out.println(s1+ " is greater than " +s2);
       else if(s1.compareTo(s2)>0)
       System.out.println(s1+ " is lesser than " +s2);
       else
       System.out.println(" Both " + s1 + " and " + s2 + " are equal ");
    }

       
   }





