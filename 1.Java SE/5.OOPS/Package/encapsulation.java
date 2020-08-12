/*Enacpsulation is the mechanism of hideing or wrapping of code and data into a single unit just like a capsule
which is made up of different medicines.
A class can be fully encapsulated using private data members . encapsulation in java can use getter and setter method 
to set and get data within it.abstract

java bean is a fullly encapsuklated class.abstract

//Need and advantage of encapsulation :

Suppose we have a class Dog which has a field height , and can be inherited by another class . so, another class object
can be used to access the height of dog variable and make it negative which we dont want so we make dog field as private
and class encapsulated.

It provides you the control over the data. Suppose you want to set the value of id which should be greater than 100 only,
 you can write the logic inside the setter method. You can write the logic not to store 
the negative numbers in the setter method*/

// Example 1: // save as Student

/*
package s;
public class Student 
{
    private String name ; // private field

// getter method for name
    public void getname()
     {
        return name;
     }

// setter method for name
    public  void setname(String name)
     {
        this.name =  name ;
     }

  
}

package s1;
import s.*;  // save as Student 30

class Student30
{
    public static void main()
     {
         Student obj = new Student();
         obj.setname("Lucy");
         System.out.println(obj.getname());
     }
}*/

// Read Only Class :
 /* where you cant only use setter not getter private 

  class Student{
      private String name ;

      void setdata(String name)
        {
            this.name = name ;
        }
  }*/

  // can use obj.setdata("Patrick");

   //cant use obj.getdata(); // compile time error since it is write only class we cant get data

   /*Read Only Class 
   where you can only use getter not setter private 
 
   class Student{
       private String name ;
 
       public String getdata()
        {
            return name ;
        }
   }*/
 
// obj.getdata() is ok
// obj.setdata() not ok.// Since it is only read only using set method.
//System.out.println(s.getCollege());//Compile Time Error, because there is no such method  
//System.out.println(s.college);//Compile Time Error, because the college data member is private.   
//So, it can't be accessed from outside the class 