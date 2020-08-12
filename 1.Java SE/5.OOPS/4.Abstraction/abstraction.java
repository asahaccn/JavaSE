// abstraction in java is hideing of the internal details and mechanism and showing only the functionality.

// abstract class : a class with abstract keyword is called abstract class
// a abstract class has abstrct method , non abstract method. the abstract class needs to be extented and method 
// implemented. it cannot be instantiated .  final class can have constructor and static method.

/*
Abstraction can be achived by :
ABSTRACT CLASS ( 0 -- 100 %)
AND BY INTERFACE (100 %) */

/*
 Abstract method : method which is declared abstract has no imlementation.
 abstract void run();
*/

//Example of abstract class with method :
/*
abstract class bike // abstract class 
{
    abstract void run(); // abstract method
    void break1() // non - abstract method
    {
        System.out.println("Drive Slow");
    }
}

class bike2 extends bike{
    void run()
    {
        System.out.println("Bike Is Running !"); //abstract method is implemented
    }

    public static void main(String[] args)
    {
        bike2 obj = new bike2(); 
        obj.run(); // Bike is running.
        obj.break1(); // Drive Slow.
    }
}*/
  
// Another example of abstract class and abstract method.
/*
abstract class Bank
{
    abstract int getrateofinterest();
}

class SBI extends Bank
{
    int getrateofinterest();
    {
         return 7 ;
    }
}

class PNB extends Bank
{
    int getrateofinterest();
    {
        return 8 ;
    }
}

class Banktest 
{
    public static void main(String[] args)
    {
       Bank b ;
       b = new SBI();
       System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");
       b = new PNB();
       System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");


    }
}


abstract class bike // abstract class 
{
    abstract void run(); // abstract method
    void break1() // non - abstract method
    {
        System.out.println("Drive Slow");
    }
}

class bike2 extends bike{
    void run()
    {
        System.out.println("Bike Is Running !"); //abstract method is implemented
    }

    public static void main(String[] args)
    {
        bike2 obj = new bike2(); 
        obj.run(); // Bike is running.
        obj.break1(); // Drive Slow.
    }
}*/

//Abstract class with data members , abstract methods and constructor.

//Example of an abstract class that has abstract and non-abstract methods  
 abstract class Bike{  
   Bike(){System.out.println("bike is created");}  
   abstract void run();  
   void changeGear(){System.out.println("gear changed");}  
 }  
//Creating a Child class which inherits Abstract class  
 class Honda extends Bike{  
 void run(){System.out.println("running safely..");}  
 }  
//Creating a Test class which calls abstract and non-abstract methods  
 class TestAbstraction2{  
 public static void main(String args[]){  
  Bike obj = new Honda();  
  obj.run();  
  obj.changeGear();  
 }  
}  