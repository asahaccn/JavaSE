// What is aa package ?
/* A package is a group of classes , interface and sub packages.

they are categorised into two types
1. Build in package like java.util , swing , awt , io , sql , swing etc.
2. User defined package

Advantages of package :

1. Package are used to maintain classes properly
2. Package provides access protection
3. Package are used to resolve nameing conflict


//How to run a package 

/*
     ------ Very Very Important -------

     case 1:
        To Compile and Run the package in the same directory
        compile:
          e>source> javac d . simple.java
        Run:
        e>sources> java Simple

    case 2:
       To Compile and Run the package in different directory
        compile:
          e>source> javac d c:\demo\ classes  simple.java
        Run:
        e>sources> java classpath c:\demo\ classes mypack.Simple


*/ 



//Example 1 : Creating a simple package that should be saved using class name here : Simple.java
/*
package mypack ;

public class Simple 
{
    public static void main()
    {
        System.out.println("Welcome To The Package: ");
    }
}
*/


/* How to access a package ferom outside the package there are 3 ways to do so 

1. import package.*  
   // to import all the clases and interface of another package within the current package but not the sub package


2. import package.classname 
     // to import the class of another package  (one class)

3.  fully qualified name
    // if you use fully qualified classname then we can acees the class of the package.
    we donot use import but everytime we have to use fully qualified name to acees class and interface of another
    package.
    we use fully qualified name when we have to or more package with same class name like java.util and .sql hava data class.


*/


// Example 1 : import package.*

// save as class A


/*package pack;
public class A{

    public static void main(String[] args)
   public void msg()
    {
        System.out.println("Hello Inside Package pack!");
    }

}


// save as class B

package pack1 ;
import pack.* ;


class B{
    public static void main(String[] args)
    {
       A object = new A();
       object.msg(); //  "Hello Inside Package pack"
    }
}
   


  // Example 2 : using import package.classname

 /* package pack;
public class C{

    public static void main(String[] args)
   public void msg()
    {
       System.out.println("Hello Inside Package demo!");
    }

}


// save as class B

package demo1 ;
import pack.C ;


public class D{
    public static void main(String[] args)
    {
       C object = new C();
       object.msg(); // "Hello Inside Package demo!"
    }
}
   */

 // Example 3: using fully qualified name 
/*
package test;
class E{

    public static void main(String[] args)
    void msg()
    {
        Ssytem.out.println("Hello Inside Package Test!");
    }

}


// save as class B

package test1 ;



class F{
    public static void main(String[] args)
    {
       test.E object = new test.E();//using fully qualified name  
       object.msg(); //  Hello Inside Package Test!.
    }
}
   */

   

   // sub package : package within a package , it is used to futher categorize a package.

  /* package mypack1.test ; // subpackage

   package mypack.test ;
   class Simplicity 
   {
     public static void main(String[] args)
     {
        System.out.println("Hello Subpackage!");
     }
   }*/

   // How to put two public classes in a package? 

   /*If you want to put two public classes in a package, have two java source files 
   containing one public class, but keep the package name same.
   
   For example 1:

   package abc ;

public class G
{
 
     void msg()
   {
     System.out.println("Hello Class G!");
  }

 public static void main(String args[])
{
   G obj = new G();
    obj.msg();//Hello Class G!
}

}
*/

/*for example 2 :


package abc ;

public class H
{

  void msg()
   {
     System.out.println("Hello Class H!");
  }

public static void main(String[] args)
{
  H obj = new H();
    obj.msg(); // ("Hello Class H!");
}
}
*/