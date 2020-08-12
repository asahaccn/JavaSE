
 //copy constructor does not exists in java it only exists in c++ but  we create it using java constructor , copying value of one
 //object to another or by method clone() method of the object class.

// copy constructor through java constructor

/*class Student6
    {
        int rollno ;
        String name ;
        

        Student6(int r, String n ) // constructor to intialize int and string
        {
             rollno = r ;
             name = n ;
             
        }

        Student6(Student6 s) // constructor to initialize anothe object
        {
             rollno = s.rollno ;
             name = s.name ;
            
        }

        void display()
        {
            System.out.println(rollno+ " " +name);
        }
    }
 
    class Student7
    {
        public static void main(String[] args)
        {
            Student6 s1 = new Student6(1 , "Clay"); // 1 clay 
            Student6 s2 = new Student6(2, "Jenkins"); // 2 jenkins 

            s1.display();
            s2.display();
        }*/



        // example 2 : copying value of object into another
        class Student10
    {
        int rollno ;
        String name ;
        

        Student10(int r, String n ) // constructor to intialize int and string
        {
             rollno = r ;
             name = n ;
             
        }

        Student10() // constructor to initialize anothe object
        {
            
        }

        void display()
        {
            System.out.println(rollno+ " " +name);
        }
    }
 
    class Student9
    {
        public static void main(String[] args)
        {
            Student10 s1 = new Student10(1 , "Clay"); // 1 clay 
            Student10 s2 = new Student10(2, "Jenkins"); // 2 jenkins 

            s2.rollno = s1.rollno ;// copying s1 object value into s2
            s2.name =  s2.name ;
            s1.display();
            s2.display();
        }
    }

/*few questions :

  constructor is not only used to initialize a object but also used in object creation , starting a thread
  and  functional call etc.

  What is the purpose of Constructor class?

Java provides a Constructor class which can be used to 
get the internal information of a constructor in the class. It is found in the java.lang.reflect package.*/