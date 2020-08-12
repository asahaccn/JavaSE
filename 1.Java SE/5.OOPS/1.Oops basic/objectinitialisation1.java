
    
    // we can initialize objects in 3 ways 
    // 1. Refernce Variable : we will see in this example.
    //2. Method
    //3. Constructor

   class Students {
       int id ; 
       String name ;
    
   }

   class Student1
   {
       public static void main(String[] args)
       {
       Students s1 = new Students();
       Students s2 = new Students();// creating multiple objects of student class

       s1.id = 10;
       s1.name = "John Doe";

       s2.id =  11;
       s2.name = "Alex Ruso";
    

       System.out.println(s1.id+ " " +s1.name); //printing data.
       System.out.println(s2.id+ " " +s2.name); //printing data.

       }


   }

