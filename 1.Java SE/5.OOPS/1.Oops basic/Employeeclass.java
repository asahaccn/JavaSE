class Employee {

    // object intitialisation using Constructor.

    int id ;
    String name ;
    int salary ;

       void Employee(int r , String n , int sal)
        {
          id = r ;
          name = n ;
          salary = sal ;
        }

        void display()
        {
            System.out.println(id+ " " +name+ "  " +salary);
        }
    
}

class Employee1 

{
     public static void main(String[] args)
     {
         Employee e1 = new Employee();
         Employee e2 = new Employee();
         Employee e3 = new Employee();
         
         e1.Employee(10,"Vivan", 15000);
         e1.display();

         e2.Employee(10,"Arnab", 20000);
         e2.display();

         e3.Employee(10,"Suresh", 25000);
         e3.display();

     }
}