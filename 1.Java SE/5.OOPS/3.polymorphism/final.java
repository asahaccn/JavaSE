/*The final keyword in java is used to restrict the user. The java final keyword can be used in many context. Final can be:

    variable
    method
    class

The final keyword can be applied with the variables, a final variable that have no value it is called blank final variable or uninitialized final variable. It can be initialized in the constructor only. The blank final variable can be static also which will be initialized in the static 
block only. We will have detailed learning of these. Let's first learn the basics of final keyword. */

// final variable : value cannot be changed.

/*class Bike9{  
    final int speedlimit=90;//final variable  
    void run(){  
     speedlimit =400;  
    }  
    public static void main(String args[]){  
    Bike9 obj=new  Bike9();  
    obj.run();  
    }  
   }//end of class  // compile time error
   */

   // final method : cannot be overidden

  /* class Bike{  
    final void run(){System.out.println("running");}  
  }  
       
  class Honda extends Bike{  
     void run(){System.out.println("running safely with 100kmph");}  
       
     public static void main(String args[]){  
     Honda honda= new Honda();  
     honda.run();  
     }  // compile time error
  }  */

  // Final class cannot be inherited.

 /* final class Bike{}  
      
  class Honda1 extends Bike{  
    void run(){System.out.println("running safely with 100kmph");}  
      
    public static void main(String args[]){  
    Honda1 honda= new Honda1();  
    honda.run();  
    }  // compile time error
  }  */

  /*
  Q) Is final method inherited?

Ans) Yes, final method is inherited but you cannot override it. For Example:

    class Bike{  
      final void run(){System.out.println("running...");}  
    }  
    class Honda2 extends Bike{  
       public static void main(String args[]){  
        new Honda2().run();  
       }  
    }  

Test it Now

Output:running...

Q) What is blank or uninitialized final variable?

A final variable that is not initialized at the time of declaration is known as blank final variable.

If you want to create a variable that is initialized at the time of creating object and once initialized may not be changed, it is useful. For example PAN CARD number of an employee.

It can be initialized only in constructor.
Example of blank final variable

    class Student{  
    int id;  
    String name;  
    final String PAN_CARD_NUMBER;  
    ...  
    }  
  
  
  
  
  */

