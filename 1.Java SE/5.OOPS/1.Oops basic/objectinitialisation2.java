 class Students1 {
    
    // object initialistion using method
    int rollno ;
    String name ;

    void setRecord(int r ,String n) // to set the data
    {
      rollno = r ;
      name = n ;
    }

    void getRecord() //to get the data print the data
    {
          System.out.println(rollno+ " " +name);
}
 }

class StudentTest 
{
    public static void main(String[] args)
    {
        Students1 s1 = new Students1();
        Students1 s2 = new Students1();

        s1.setRecord(10 ,"Alex");
        s1.getRecord();

        s2.setRecord(11,"clay");
        s2.getRecord();
    }
}