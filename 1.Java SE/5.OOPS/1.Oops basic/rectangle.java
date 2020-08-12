class Rectangle 
{
    int length ;
    int width ;

    void setArea(int l , int w) // method to intialise object
    {
       length = l;
       width =  w ;
    }

    void getArea()
    {
        System.out.println("Area : " +length*width);
    }


}

class Rectangle1
{
    public static void main(String[] args)
    {
          Rectangle obj = new Rectangle();
          obj.setArea(10,5);
          obj.getArea();

          // another small thing : we can create multiple objects by one time only as we do in case of primitives
         /* int a =10 , b = 20;
         Rectangle r1 = new Rectangle() , r1 = new Rectangle();*/
    }
}