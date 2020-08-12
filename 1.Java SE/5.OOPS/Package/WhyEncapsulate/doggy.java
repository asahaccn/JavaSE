
package simple1;
import simple.*;

class doggy 
  {
      public static void main(String[] args)
       {
        dog tomy = new dog();

        tomy.setheight(-10);
        tomy.setcolour("White");

        System.out.println("Tommy's Height is : " +tomy.getheight());
        System.out.println("Tommy's Colour is : " +tomy.getcolour());
       }
     

  }