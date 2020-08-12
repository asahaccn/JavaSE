public class trycatch {
    
    // try catch example1
    public static void main(String[] args)
    {
          /*int a = 50 /0 ; // may throw a excption
          System.out.println("Rest Of The code");
          // as there is a exception arithmeticexecption so the rest of the code is not executed .*/


        /*  // exception handleing solution to example 1
         // example2

          try{
              int a = 50/0 ;
          }

          catch(ArithmeticException e){
              
             System.out.println(e) ; // prints arithmetic exception divide by zerand then prints rest of the 
            // code  so the entire rest of code is executed even after the exception unlike example1.
          }

          System.out.println("Rest of the code");
    }*/

 /*// example 3 : wrt to example 2 if we write rest of the code in try block it does not execute the remaining code
  // if an exception is found at try block.

     try{
         int a = 50/0 ; //  only displays arithmeticException divide by 0 and doers not execute "rest ofthe code"
         System.out.println("Rest of the code");
     }

     catch(Exception e){
         System.out.println(e);
     }*/

   /* // Example 4: Printing a custom message on exception.

    try{
         int a = 50/0 ;
    }
    catch(Exception e){
       System.out.println("can't divide by zero");
    }*/

    //Example 5: to resolve the exception in a catch block

        int i = 50 ;
       int j = 0 ;
       int data ;

    try{
         data = i /j;
         
    }

    catch(Exception e){
        
        System.out.println(i/(j+2)); // prints 25.
    }

}
}