/*Inheritance : is the mechanism of creating a new class from an already existing one .
the new class object iherits the state and and behaviour of the parent object.
When a class is created or build upon the already existing class , the new class inherits and can reuse
the parent or super class method and field and can also have its own method and field.

Inheritance follows IS-A Relationship also known as parent child relationship.
     like dog is a animal.

Inheritance is used for mainly two things :

1. Method overrideing ( so runtime polymorphism is achived )
2. code Reuseability.abstract
*/

// Example :

/*class Employee
{
    float salary = 35000 ;
}

class Programmer extends Employee
{
    int bonus = 20000 ;

    public static void main(String[] args)
     {
        Programmer obj = new Programmer();
        System.out.println("Salary is : " +obj.salary);
        System.out.println("Bonus is : "  +obj.bonus);
     }
}*/
 // --- Java supports 3 types of Inheritance.
/* Types of inheritance : 1. Single inheritance class A ---> Class B . where one class inherits from another class

2. Multilevel Inheritance : class A ---> class B ---> class C  . where each class inherits from another like a chain.

3. Hierchical  Inheritance : class A ---> class B , class C  . where there is is one base class and multiple extended class

------Inheritance not present in java ----

4. Multiple Inheritance : class A , class B ---> class C , a single class is inherited from multiple base classes.
     java does'nt support multiple inheritance through class through by using interface it is supported.

5. Hybrid Inheritance : class A----> class B,C ---> class D. Combination of both Hierchical and Multiple inheritance.
*/

// 1.Single Inheritance

   /* class Animal {
        void eat()
        {
            System.out.println("eating...");
        }
    }

    class Dog extends Animal
    {
         void bark()
         {
            System.out.println("barking...");
         }
         public static void main(String[] args)
         {
            Dog tomy = new Dog();
            tomy.eat(); //eating...
            tomy.bark(); //barking...
         }
    }*/


// Multilevel Inheritance 


/*class Animal {
    void eat()
    {
        System.out.println("eating...");
    }
}

class Dog extends Animal
{
     void bark()
     {
        System.out.println("barking...");
     }

    }

    class BabyDog extends Dog{

        void weep()
        {
            System.out.println("weep...");
        }
     public static void main(String[] args)
     {
        BabyDog tomy = new BabyDog();
        tomy.eat(); //eating...
        tomy.bark(); //barking...
        tomy.weep(); //weep...
     }
}*/

// Hierchical Inheritance

/*class Animal {
    void eat()
    {
        System.out.println("eating...");
    }
}

class Dog extends Animal
{
     void bark()
     {
        System.out.println("barking...");
     }

    }

    class Cat extends Animal{

        void meow()
        {
            System.out.println("meow...");
        }
     public static void main(String[] args)
     {
        Cat tomy = new Cat();
        tomy.eat(); //eating...
        tomy.meow(); //meow...
       // tomy.bark(); // wrong since in hierchical inheritance cat extends animal not dog so its object cant refer to 
        // dog class.
     }
}*/

/*
  Java Does'nt support multiple inheritance beacuse 
  let us consider an example class A inherits from bot class b and c , know class b and c both contains the same 
  method know compiler gets confused which method is to be called during runtime class b's or c . 
  so its better to encounter a compiler time error than a runtime error so java renders a compile time error in
  case of multiple inheritance whether same or differnt method.

*/ 

// Example : Multiple Inheritance :

class A
{
  void fun()
  {
      System.out.println("class A");
  }
}

class B{

    void fun()
  {
      System.out.println("class B");
  }

}

class C extends A,B{//suppose if it were  
   
    public static void main(String args[]){  
      C obj=new C();  
      obj.fun();//Now which msg() method would be invoked?  
   }  
   }  



