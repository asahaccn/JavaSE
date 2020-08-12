//Method Overloading
/*
We achieve polymorphism with the means of method overloading
Method overloading : where method name is same but parameters are different
1.no of paramrters are differnt
void fun {}
void fun(int a) {}


2.type of parameters are different 
void fun(int i) {}
void fun(char c)  {}


3.Order of parameters are different
void fun(int i , char c) {}
void fun(char c , int i)  {}

*/

//Example 1:

class OverloadDemo
{
    void f()
    {
        System.out.println("f()");
    }

    void f(int a)
     {
       System.out.println("f(int a)");
     }

     void f(char c)
     {
        System.out.println("f(char c)");
     }   

     void f(int a , char c)
     {
        System.out.println("f(int a , char c)");
     }

     void f(char c , int i)
     {
        System.out.println("f(char c , int i)");
     }

     public static void main(String[] args)
     {
         OverloadDemo obj = new OverloadDemo() ;
         obj.f();
         obj.f(10);
         obj.f('c');
         obj.f(20, 's');
         obj.f('s',20);


         /* output:
f()
f(int a)
f(char c)
f(int a , char c)
f(char c , int i)


         */


        /* Example 2:
In this example, we are creating static methods so that we don't need to create instance for calling methods.

    class Adder{  
    static int add(int a,int b){return a+b;}  
    static int add(int a,int b,int c){return a+b+c;}  
    }  
    class TestOverloading1{  
    public static void main(String[] args){  
    System.out.println(Adder.add(11,11));  
    System.out.println(Adder.add(11,11,11));  
    }}  
 */

 /*
    Example : 2.
 In this example, we have created two methods that differs in data type. The first add method receives two integer arguments and second add method receives two double arguments.

    class Adder{  
    static int add(int a, int b){return a+b;}  
    static double add(double a, double b){return a+b;}  
    }  
    class TestOverloading2{  
    public static void main(String[] args){  
    System.out.println(Adder.add(11,11));  
    System.out.println(Adder.add(12.3,12.6));  
    }}  
 
 
 
 
 
 
 
 */ 

     }
 }

