/*
If you want to put two public classes in a package, have two java source files 
   containing one public class, but keep the package name same.
   save as G.java
*/


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