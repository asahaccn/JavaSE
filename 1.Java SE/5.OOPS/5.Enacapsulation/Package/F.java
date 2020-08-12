/*
3.  fully qualified name
    // if you use fully qualified classname then we can acees the class of the package.
    we donot use import but everytime we have to use fully qualified name to acees class and interface of another
    package.
    we use fully qualified name when we have to or more package with same class name like java.util and .sql hava data class.
   
    Save as F.java
*/

package test1;


class F
 {
  public static void main(String[] args)
   {
      test.E obj = new test.E(); // object of derived package class is created 
      obj.msg(); // Hello Inside Package test
    }
 }
