public class stringimmuteable {

    public static void main(String[] args)
    {
   /* In Java , string objects are immutable i.e immutable means unmodifiable or unchangeable
     one string object is created it state or data caanot be changed but a new  string object is created.*/

    // example : 1.

     /* String s = "James";
      s.concat("Gosling");
        System.out.println(s);//will print James because strings are immutable objects 

      /*  but new string object with value "James Gosling " gets created in string constant pool 
        so now there is two object in string constant pool WITH VALUE 1. "James" and 2. "James Gosling".*/


        // But if we explicitely assign it to the refernce object , then it will refer to "James Gosling" object.

        String s = "James" ;
        s = s.concat(" Gosling");
        System.out.println(s);
    }

   /* Why string objects are immutable in java*/
   /* Because java uses the concept of string literal.Suppose there are 5 reference variables,all referes to 
    one object "sachin".If one reference variable changes the value of the object, it will be affected to all
     the reference variables. That is why string objects are 
    immutable in java*/
}