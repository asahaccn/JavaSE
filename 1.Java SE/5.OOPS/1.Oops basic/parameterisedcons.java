
// parameterised constructor : when we pass parameters in constructors.


class Students2
{
    int rollno ;
    String name ;

    Students2(int r , String n) // parameterised constructor 
    {
       rollno = r;
       name = n ;
    }

    void display()
    {
        System.out.println(rollno+ " " +name);
    }
}

class Studen
{
    public static void main(String[] args)
    {
        Students2 obj = new Students2(10 , "Vivan");
        obj.display();
        
    }
}