 // Java program to reverse a string using build in function.


    import java.util.Scanner;

      class Reversebuildin 
           {
             public static void main(String args[])
                {
       
              String Org_str , reverse = "";
              int i = 0 ;

            Scanner obj = new Scanner(System.in);
             System.out.println("Enter The String : ");
             Org_str = obj.nextLine();

              int length = Org_str.length();

             for(i=length-1;i>=0;i--)
              {
                reverse = reverse + Org_str.charAt(i) ;
               }
 
          System.out.println("Reverse String Is : " + reverse);
        }
  }
