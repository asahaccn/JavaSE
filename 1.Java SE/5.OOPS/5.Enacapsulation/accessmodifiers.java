// Access modifiers in java 

/* Java provides 4 types of access modifiers which specifies the accessibility or visbility or scope of a 
field , method , constrcutor ,class */

/* according to the level of acceesbility  from low to high.
 1. Private :
       the access level of a private modifier is within a class.
 2. Default :
       the access level of a default modifier is within a class , within a package it cannot be accessed outside the package
       if any access modifiers are not provided it is treated default
 3. Private : 
      the access level is within the package and outside the package with the help of a child class . It cannot be accessed
      outside the package without child class.
      package.

 4. Public :
    all access level.
    can be access within class , sub class of both package and outside package.

*/

// private : example 

/*class A{

 private int data = 50;   // private field
 private A() // private Constructor
 {
   System.out.println("Private Constructor");
 }
 void msg()
  {
      System.out.println("Hello");
  }
}

class b{
  public static void main(String[] args)
   {
       A obj = new A();
       System.out.println(obj.data); //  The constructor A() is not visible
                                     // compile time error// The field A.data is not visible // cant access private data 
                                     // field outside the class.
       obj.msg();
   }
}*/

// Default :

/*package mypack ;

class A{
    void msg()
     {
         System.out.println("Hello !");
     }
}

package mypack1;
import mypack.*;
class B{
    public static void main(String[] args)
     {
        A obj = new A();
        obj.msg(); // compile time error since class A is default it cannot be accesed from outside the package.
     }
}*/

// protected:

/*package mypack ;

public class A{
   public void msg()
     {
         System.out.println("Hello !");
     }
}

package mypack1;
import mypack.*;
class B extends A{
    public static void main(String[] args)
     {
        A obj = new A();
        obj.msg(); // Hello !.
     }
}*/

// Public:

/*package mypack ;

public class A{
    void msg()
     {
         System.out.println("Hello !");
     }
}

package mypack1;
import mypack.*;
class B{
    public static void main(String[] args)
     {
        A obj = new A();
        obj.msg(); // Hello !
     }
}*/

// Java Access modifiers with method overideing.

/*
class A{
   void msg() // Since class A is default it is more restricted.
     {
         System.out.println("Hello Class A !");
     }
}

public class B extends A{

       void msg()
         {
              System.out.println("Hello Hi!");
         }
         public static void main(String[] args)
     {
         B obj = new B();
         obj.msg(); //The default modifier is more restrictive than protected. That is why, there is a compile-time error.
     }
}
*/