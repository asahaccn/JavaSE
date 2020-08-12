/*
 This Keyword :
  
 1. This Keyword is used to refer to the current class instance variable.
 2. This keyword is used to invoke the current class method(implicity).
 3. This Keyword is used to invoke the current class Constructor
 4. This Keyword can be passed as a argument in the current class method
 5. This Keyword can be passed as a argument in the current class constructor.
 6. This Keyword can be used to return the current class instance from the method.


*/


/* example 1:
1. this: refer to the current class instance variable.*/

//Understanding the problem without this keyword. ( we cannot differntiate the ambiguity between instance variable and par
//mmeters or for mal arguments)

/*class Student30
{
    int rollno ;
    String name ;
    float fee ;
    

    Student30(int rollno , String name , float fee ) 
    {
         rollno = rollno ;
         name = name  ;
         fee = fee ;
         
    }


    void display()
    {
        System.out.println(rollno+ " " +name+ " " +fee);
    }
}

class Student31
{
    public static void main(String[] args)
    {
        Student30 s1 = new Student30(1 , "Clay" , 15000); // 0 null 0.0
        Student30 s2 = new Student30(2, "Jenkins" , 20000); // 0 null 0.0

        
        s1.display();
        s2.display();
    }
}

/*Solving the above problem where there is a ambiguity between the parameters i.e formal argumnets and 
instance variable . Solveing it using this keyword removal of the ambiguity between local and instance variable. */

/*class Student32
{
    int rollno ;
    String name ;
    float fee ;
    

    Student32(int rollno , String name , float fee ) 
    {
         this.rollno = rollno ; 
         this.name = name  ;
         this.fee = fee ;
         
    }


    void display()
    {
        System.out.println(rollno+ " " +name+ " " +fee);
    }
}

class Student33
{
    public static void main(String[] args)
    {
        Student32 s1 = new Student32(1 , "Clay" , 15000); // 1 Clay 150000.0
        Student32 s2 = new Student32(2, "Jenkins" , 20000); // 2 Clay 20000.0

        
        s1.display();
        s2.display();
    }
}*/

// where this keyword is not required
/*class Student34
{
    int rollno ;
    String name ;
    float fee ;
    

    Student34(int r , String n , float f ) 
    {
         rollno = r ;
         name = n  ;
         fee = f ;
         
    }


    void display()
    {
        System.out.println(rollno+ " " +name+ " " +fee);
    }
}

class Student35
{
    public static void main(String[] args)
    {
        Student34 s1 = new Student34(1 , "Clay" , 15000); // 1 Clay 150000.0
        Student34 s2 = new Student34(2, "Jenkins" , 20000); // 2 Clay 20000.0

        
        s1.display();
        s2.display();
    }
}*/


// Example : this to call/invoke current class method(implictly)
//You may invoke the method of the current class by using the this keyword. If you don't use the this keyword, compiler automatically adds this
// keyword while invoking the method.

/*
class test
{
    void m()
    {
      System.out.println("Hello m");
    }

    void n()
    {
        System.out.println("Hello n");
       // m(); /// same as this.m()
        this.m(); // this here invokes the curret class method implictly.
         // even if we dont declare this the compiler will do it by default add this keyword while invokeing the
         // method like m()
    }
}

class Test2
{
    public static void main(String[] args)
    {
        test obj = new test();
        obj.n(); // hello n 
                // hello m
    }
}*/

// Example :
//this keyword to invoke the current class constructor
// invokeing a default constructor within in a parameterised one


class abc
{
    
  abc() //  default constructor 
  {
      System.out.println("Default Constructor");
  }

  abc(int x) // parameterised constructor
  {
      this(); // calls default constructor.
      System.out.println(x);
  }
}

class abcd
{
    public static void main(String[] args)
    {
        abc obj = new abc(10); //default constructor
                               //  x.
        
    }
}