
/*
1. import package.*  
   // to import all the clases and interface of another package within the current package but not the sub package
*/

/*1. first example to acces package  using import package.*/
// save file as B.java



package pack1;
import pack.*;

class B
{

public static void main(String[] args)
{
   A obj = new A();
    obj.msg() ; // hello World
}
}