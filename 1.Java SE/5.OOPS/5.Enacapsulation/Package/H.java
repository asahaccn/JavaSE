
/*
If you want to put two public classes in a package, have two java source files 
   containing one public class, but keep the package name same.
   save as H.java
*/



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