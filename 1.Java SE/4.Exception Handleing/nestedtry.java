public class nestedtry {

      // nested try block are used when some part of the code may cause one error while rest code causes other errors.
    public static void main(String[] args)
    {
       try{

           try{
              System.out.println("Going To Divide");
              int b = 39/0;
           }

           catch(ArithmeticException e){
                  System.out.println(e);
           }

           try{
               int a[] = new int[5];
               a[5] = 39/0;
           }

           catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
     }
     System.out.println("other statement");
    }
        

          catch(Exception e)
          {
            System.out.println("Exception Handled");
          }

          System.out.println("Normal Flow");

       }
    }


    // output: java.lang.ArithmeticException: / by zero
              //  Exception Handled
              //  Normal Flow
