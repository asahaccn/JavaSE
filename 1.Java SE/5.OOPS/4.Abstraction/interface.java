/*Interface in java is blueprint of a class . It unlike abstract class only contains abstract methods
with no body , a class that implements a interface must also implement all the interface methods.
Interface also consits of final,static,private data memebers . By deafult all the methods inside a interface is 
abstract with no body and filed are public, static and final by default.

class extends a class , interface implements interface , class implements interface.

Implements are used for abstraction(100%) and multiple inheritance.

*/


//Example 1:

/*
interface printable{  
    void print();  
    }  
    class A6 implements printable{  
    public void print(){System.out.println("Hello");}  
      
    public static void main(String args[]){  
    A6 obj = new A6();  
    obj.print();  
     }  
    }  */

// Example 2:

/*
       interface Bank{  
    float rateOfInterest();  
    }  
    class SBI implements Bank{  
    public float rateOfInterest(){return 9.15f;}  
    }  
    class PNB implements Bank{  
    public float rateOfInterest(){return 9.7f;}  
    }  
    class TestInterface2{  
    public static void main(String[] args){  
    Bank b=new SBI();  
    System.out.println("ROI: "+b.rateOfInterest());  
    }}  

*/ 