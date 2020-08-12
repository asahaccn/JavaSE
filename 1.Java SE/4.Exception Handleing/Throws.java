
import java.io.IOException;
public class Throws {
    
    // The throws block in java is used to declare an exception , it does not throw an exception explicitly but it declares
    // an exception it makes the programmer aware that there may be an exception in the method .
    // it is used with method signature

    /* Which Exception should be declared ?
     always checked exception should be declared 
     unchecked exception like nullpointer exception is under the control of the programmer so it should be checked before  
     the code is used.
     error is not under any one's control as stackoverflow , outofmemory and virtualmemory error cannot be controleed.*/

   /* Advantages of Java Throws keyword:
     1. Checked exception can be propagated (forwarded in call stack)
     2.  It makes the caller of the method aware that there is a exception.*/


     void m() throws IOException
     {
       throw new IOException("device error");
     }

     void n() throws IOException
     {
         m();
     }

     void p()
     {
         try{
             n();

         }
         catch(Exception e)
         {
             System.out.println("Exception Is Handled");
         }
     }
    public static void main(String[] args)
    {
        Throws  obj = new Throws();
        obj.p();
       System.out.println("Normal flow");
    }

    // output:  Exception is handled
                    // Normal flow.
}