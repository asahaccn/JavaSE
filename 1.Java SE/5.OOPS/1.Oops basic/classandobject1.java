
//main within the class
/*class Student
 {
     int id ; // field / data member / instance variables
     String name ;

     
     
      public static void main(String[] args)
      {
          Student obj = new Student(); // creating an object of student class
          System.out.println(obj.id); // accesing member through reference variables //0
         System.out.println(obj.name); //null
      }
    }*/

      // main outside class
      class Student {
          int id ; 
          String name ;
      }

      class TestStudent1
      {
      public static void main(String[] main )
      {
         Student obj = new Student() ;
         System.out.println(obj.id); //0
         System.out.println(obj.name); //null
      }
 }