// why we should use encapsulation

//Sava as dog.java

// in this example we will clearly see why we need encapsulation // as we have set bot height and color and private
//so it can only be asked within the class so in the set method we have included a condition that if height is greater
// than 0 then only one can input height value from main else if we didnt encapsulate our class with private 
// data field and set get method with condition then anyone would be able to set height of dog -10 which is gramatically
//correct but logically wrong height of a dog cant be negative . So, that's why.

/*package simple ;*/ // can be runed using package and not using also.
public class dog {
    
    private int height ;
    private String colour ;

    void setheight(int height)
    {
        if(height>0)
        {
            this.height = height ; 
        }
       
    }

    

    void setcolour(String colour)
    {
        this.colour = colour ;
    }

    public int getheight()
    {
      return height ;
    }

    public String getcolour()
    {
      return colour ;
    }
}

//Save file as doggy.java
/*package simple1;
import simple.*;*/

class doggy 
  {
      public static void main(String[] args)
       {
        dog tomy = new dog();

        tomy.setheight(10);
        tomy.setcolour("White");

        System.out.println("Tommy's Height is : " +tomy.getheight()); //10.
        System.out.println("Tommy's Colour is : " +tomy.getcolour()); // White.
       }
     

  }