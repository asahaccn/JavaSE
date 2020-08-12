/*java static keyword : static keyword is used for memory management i.e consumtion of less memory.

static keyword is applicable to 
1 .variables 
2. Methods
3. Blocks
4. nested classes.

1. static variable 
     the static variable is used to represent the common property among objects (  not unique ones)
     just like college name of students , organisation name of employee's.

     Static variable is allocated memory only once when the class is loaded into the memeory .

     for example : a student class contains rollno , name which are unique to a user which cannot be static
          but college name can be static as it it same for students so it will get memory once and its copies will
          be kept by objects.

    2. effective memory utilisation : memory management.
*/

// static variable : Example 1.

/*class Student20
{
  int rollno ;
  String name ;
  static String college = "LTS";

   Student20(int r , String n)
   {
        rollno = r ;
        name = n ;
   }

   void display()
   {
      System.out.println(rollno+ " " +name+ " " +college);
   }

}

class Student21
{
    public static void main(String[] args)
    {
        Student20 s1 = new Student20(10 , "Christine"); 
        Student20 s2 = new Student20(20, "Austin");
        s1.display(); // 10 Christine LTS
        s2.display(); // 20 Austin LTS 
    }
}*/

/*example 2 : In this example, we have created an instance variable named count which is incremented in the constructor. 
Since instance variable gets the memory at the time of object creation, each object will have the copy of the instance 
variable. 
If it is incremented, it won't reflect other objects. So each object will have the value 1 in the count variable.*/



/*class Counter{
    int count = 0 ;

    Counter()
    {
        count++ ;
        System.out.println(count);
    }
}

class Counter1
{
    public static void main(String[] args)
    {
        Counter a = new Counter(); //1
        Counter b = new Counter(); //1
        Counter c = new Counter(); //1
    }
}*/

/* Example 2.1 As we have mentioned above, static variable will get the memory only once, if any object 
changes the value of the static variable, it will retain its value.*/

/*class Counter2{
    static int count = 0 ;

    Counter2()
    {
        count++ ;
        System.out.println(count);
    }
}

class Counter3
{
    public static void main(String[] args)
    {
        Counter2 a = new Counter2(); //1
        Counter2 b = new Counter2(); //2
        Counter2 c = new Counter2(); //3
    }
}*/

/*Static method

If you apply static keyword with any method, it is known as static method.

    A static method belongs to the class rather than the object of a class.
    A static method can be invoked without the need for creating an instance of a class.
    A static method can access static data member and can change the value of it.*/


   /* class Student23
    {
      int rollno ;
      String name ;
      static String college = "LTS";
    
       Student23(int r , String n)
       {
            rollno = r ;
            name = n ;
       }

       static void changename()
       {
           college = "CLTS" ;
       }
    
       void display()
       {
          System.out.println(rollno+ " " +name+ " " +college);
       }
    
    }
    
    class Student24
    {
        public static void main(String[] args)
        {
            Student23.changename(); // calling static method without instance of a class
            Student23 s1 = new Student23(10 , "Christine"); 
            Student23 s2 = new Student23(20, "Austin");
            s1.display(); // 10 Christine CLTS
            s2.display(); // 20 Austin CLTS 
        }
    } */

    /* 1. We cannot access non static data members using static method
       2. We cannot use this and super keyword in static method */ 

      /* class nonstatic{
        int a = 10 ;

        public static void main(String[] args)
        {
          System.out.println(a); // Cannot make a static reference to the non-static field a , compile error
        }
       }*/
      

       /* Static block :

       1.Static block is used to access static data members 
       2. Static  block is executed before the main during the time of class loading*/

      /* class Example{

        static { // static block
            System.out.println("Static block is invoked");
            
        }
       
           public static void main(String[] args)
           {
               System.out.println("Main executes");
           }
       }*/

       /* why main method() in java is static ?

      ans : It is because the object is not required to call a static method. If static method, JVM creates an object first 
       then call main() method that will lead the problem of extra memory allocation.*/
   