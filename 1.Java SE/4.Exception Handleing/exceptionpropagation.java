public class exceptionpropagation {
    
    //Java Exceptionppropagation is a technique in which the exception is dropeed from the top of the stack and
    // if not caught it drops down the call stack to be caught by the previous method if not caught then again waits for
    // the previous method this gets repeated until the end of stack call is reached.

        void m()
        {
           int data = 50/0;
        }

        void n()
        {
            m();
        }

         void p()
         {
        try {
            n();
        }

        catch(Exception e){
          System.out.println("Exception Handled");
        }
    }
     
        public static void main(String[] args)
        {
            exceptionpropagation obj = new  exceptionpropagation();
            obj.p();
            System.out.println("Normal Flow");

            // output : Exception handled
                       // Normal Flow.
        }
    }