/*
2. import package.classname 
     // to import the class of another package  (one class)
   save as D.java
*/

package demo1;
import demo.C;

class D
 {
  public static void main(String[] args)
   {
      C obj = new C(); // object of derived package class is created 
      obj.msg(); // Hello Inside Package demo
    }
 }
