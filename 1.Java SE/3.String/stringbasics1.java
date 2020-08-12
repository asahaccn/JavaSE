public class stringbasics1 {

    public static void main(String[]  args)
   {

     /* String is an array of characters in geneeral , in java it is object that represent array of characters.
     String can be declared in two ways as follows :
     
     1. String Literal :

        String s = "Java" ;
        First JVM will check that the string object with value "Java" exists in the string constant pool or not if it does it returns 
        the refernce to the instance of the constant pool or else creates  a new one .

        for example if :

        same object is created 

        String s1 = "Java" ; // first jvm will search if "java" exists in string constant pool or not if note it
        creates the string object with value "java" and then search for it in string constant pool then return the instance of it .
        String s2  = "Java" ;  // in case of s2 since object "java" already exits so return the refernce to the same object
        so both s1 and s2 points at same location , string object with value "Java".
        
        2. By New Keyword

        String s = new String("Java"); // creates 2 objects with one reference varaible

        JVM Creates a new string object in the (non-constant pool)heap area and the literal "Java" on the 
        string constant pool . The varaible s will refer to a object in heap(non-pool).

     
     */ 


     String s1 = "Welcome" ; // string is created using java string literal
     char ch[] = {'s' , 't' , 'r' , 'i' , 'n'  , 'g'}; // array of character
     String s2 = new String(ch); // converting array to string
     String s3 = new String("World"); // createing string using new.

     System.out.println(s1);
     System.out.println(s2);
     System.out.println(s3);


    

    }

}