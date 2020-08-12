public class Finally {
    
    // Finally block in java contains the import code that is to be executed . irrespective of the execption being
    // handled or not finally block is executed
      //Finally is mainly used for cleaning the code or closeing the connection.

    public static void main(String[] args)
    {

        //Example 1: where exception does not ocuur

      /*  try{
           int data  = 50/2  ;
           System.out.println(data);
        }

        catch(Exception e){
             System.out.println(e);
        }
        finally{
            System.out.println("finally block is always executed");
        }
        System.out.println("Rest Of The Code");*/

        // output: // 25
                   // finally block is always executed"
                   // Rest Of The Code


      // Example 2: where exception occurs but not handled.

                 /*  try{
                    int data  = 30/0  ;
                    System.out.println(data);
                 }

                 catch(NullPointerException e)
                 {
                    System.out.println(e);
                 }
               
                 finally{
                     System.out.println("finally block is always executed");
                 }
                 System.out.println("Rest Of The Code");*/

                // output:
                    // finally block is always executed
                   // Exception in thread "main" java.lang.ArithmeticException: / by zero


          // Example 2: where exception occurs and is handled.

          try{
            int data  = 30/0  ;
            System.out.println(data);
         }

         catch(ArithmeticException e)
         {
           System.out.println(e);
         }
       
         finally{
             System.out.println("finally block is always executed");
         }
         System.out.println("Rest Of The Code");

        // output:

             // java.lang.ArithmeticException: / by zero
            // finally block is always executed
           // Rest of the code.
         
    }
}