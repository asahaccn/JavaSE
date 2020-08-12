


  class Student 
  {
    int roll ;
    String city ; 
    String name ;


   Student(int roll , String city, String name) // constructor
    {
       this.roll = roll ; // this refers to the current class object.
       this.city = city ;
       this.name =  name ;
    }

    public String toString(){//overriding the toString() method  
       return roll+" "+name+" "+city;  
        }  


   public static void main(String args[])
      {
       Student s1 = new Student(10, "Sacremento" , "Arpan");
       Student s2 = new Student(21, "Sanfranciso" , "Arpan");

       System.out.println(s1);//compiler writes here s1.toString() 
       System.out.println(s2);//compiler writes here s2.toString()
        /*As you can see in the above example, printing s1 and s2 prints the hashcode values of the objects
         but I want to print the values of 
         these objects. Since java compiler internally calls toString() method, overriding this method will 
         return the specified values. */
}
}
