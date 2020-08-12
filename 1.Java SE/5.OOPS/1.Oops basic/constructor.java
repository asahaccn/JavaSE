
// all about constructor //

/*Constructor is a block of code similar to a method . It Is called whenever the instance of the class is created 
After Constructor calling object is allocated memory in the heap. Constructor is used to intialise object .
with the new() word declaration  a constructor is called by default using jvm known as default constructor .
there are mainly 3 types of constructor 1. No argument or default 2. with argument or parameterised 
 copy constructor does not exists in java it only exists in c++ but  we create it using java constructor , copying value of one
object to another or by method clone() method of the object class
Constructor is called as constructor because it constructs  the value as soon as the object is created.

3 golden rule for Constructor
1. Constructor has the same name as the name of the class 
2. Constructor does not have a return type
3. A Java Constructor cannot be abstract,final,static  or synchronised.*/


/*Differnce  between Constructor and Method is 

1. Constructor has the same name as the name of the class not same in case of method
2. Constrcutor has no return type method has 
3. Java compiler provides a constructor by default not in case of method
4. constructor shows the state of the object method exposes the behaviour or state */


// constructor example 1: default constructor.
class Bike {

    Bike()
    {
      System.out.println("Driving Bike");
    }
    
    public static void main(String[] args)
    {
        Bike obj = new Bike();
    }
}
   // output : Driving Bike , we have not used refernce variable to acces data members but
   // as we know as soon as the constructor is called the object get initialised 

   // example 2 : default constructor
   // default constructor is used to initialise the object of the class , it assigns default valuesto the object like null,0
   // depending on the type.

   class Student
   {
       int rollno ;
       String name ;

       void dispaly()
       {
           System.out.println(rollno+ " " +name);
       }
   }

   class Student1
   {
       public static void main(String[] args)
       {
           Student obj = new Student();
           System.out.println(obj.rollno); // 0
           System.out.println(obj.name); // null
       }
   } // no constructor is declared but still java compiler calls one by default i.e default constructor and
   // assigns a default value of 0 and null depending on the type.