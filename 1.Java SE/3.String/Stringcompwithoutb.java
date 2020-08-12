//  java program to compare 2 string in java without using build in function.

   import java.util.Scanner;

   class Stringcompwithoutb
    {
       public static boolean IsCompare(String a , String b)
       {
        if(a.length()!=b.length())
         return false ; 
           for(int i=0 ; i<a.length() ; i++)
                {
                  if(a.charAt(i) != b.charAt(i))
                   {
                    return false  ;
                }
       }
           return true ; 
         }


      public static void main(String args[])
      {
       String s1 , s2 ;
      Scanner obj = new Scanner(System.in);
      
    System.out.println("Enter first string : ");
      s1 = obj.nextLine();
     
    System.out.println("Enter second string : ");
      s2 = obj.nextLine();

       System.out.println(s1 + " is greater than " + s2 + " : " + IsCompare(s1,s2) );

       System.out.println(s2 + " is greater than " + s1 + " : " + IsCompare(s1,s2) );

       System.out.println(s1 + " = " + s2 + " : " + IsCompare(s1,s2) );
    
         
}
}