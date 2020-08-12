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
          e>source> javac -d . simple.java //  class is created within the package
        Run:
        e>sources> java pack.Simple

    case 2:
       To Compile and Run the package in different directory
        compile:
          e>source> javac d c:\demo\ classes  simple.java
        Run:
        e>sources> java classpath c:\demo\ classes mypack.Simple


*/ 



//Example 1 : Creating a simple package that should be saved using class name here : Simple.java

package mypack ;

class Simple 
{
    public static void main(String[] args)
    {
        System.out.println("Welcome To The Package: ");
    }
}


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

