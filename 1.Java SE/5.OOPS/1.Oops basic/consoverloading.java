
    class Student4
    {
        int rollno ;
        String name ;
        int age ;

        Student4(int r, String n ) // constructor overloading
        {
             rollno = r ;
             name = n ;
             
        }

        Student4(int r, String n , int a) // constructor overloading
        {
             rollno = r ;
             name = n ;
             age = a;
        }

        void display()
        {
            System.out.println(rollno+ " " +name+ " " +age);
        }
    }
 
    class Student5
    {
        public static void main(String[] args)
        {
            Student4 s1 = new Student4(1 , "Clay"); // 1 clay 0
            Student4 s2 = new Student4(2, "Jenkins" , 27); // 2 jenkins 27

            s1.display();
            s2.display();
        }
    }

