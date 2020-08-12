public class exceptionhandleingbasic
{

    // introduction to exception handleing //
    /*
      Exception : in general means an abnormal condition.
      In Java Exception is a event that disrupts the normal flow mechanism of a appliction . It is an object
      that returns on runtime .
      Exception handleing : is a strong mechanism to handle runtime error  which stops 
      the normal flow of the application , runtime errorsincludes IOException , SQLException , ClassNotFoundException,
      RemoteException etc.
    
     // proper example to undeerstand Exception //

      Statement  1 ;
      Statement  2 ;
      Statement  3 ;
      Statement  4 ;
      Statement  5 ; // exception occurs
      Statement  6 ;
      Statement  7 ;
      Statement  8 ;
      Statement  9 ;
      
      If There is an exception in statement 5 then Statement 6 to 10 will not get executed.

      //All about Java Exception  classes

       the root class is java.lang.Throwable class which is inherited by two sub class Exception and Error
       Exception class contains IoException , SqlExecption , RemoteException , ClassNotFoundExecption , RuntimeException ,
       ArithmeticExpection , NullPointerException , IndexOutOfBoundException  , ArryIndexOutOfBoundException and StringIndexOutOfBoundException

       Error class contains StackOverflow,VirtualMachineError and OutOfMmeory Error.

      // Types of Exception

         According To Orcale There are 3 types of exception 
         1.Checked Exception :
            The Classes that Directly Inherits from Trowable class execpt Runtime Exception like IoException , SqlException etc are check Exception.
            Checked Exception are checked at compile time.

        2. Unchecked Exception:
                The Classes that inherits RuntimeException like  ArithmeticExpection , 
                NullPointerException , IndexOutOfBoundException  , ArryIndexOutOfBoundException and StringIndexOutOfBoundException are
                all unchecked Exception , unchecked Exception are checked at runtime.
 
      3. Error :
         Error is a Unchecked Exception thaat cannot be recovered i.e, error is irrecoverable like Virtualmemoryerror, Stackoverflowerror etc.


      // Java Exception Keywords.

       1. Try : It is the block where exception code is placed . it doesnot exists on its own it is followed by either catch or finally.

       2. Catch : It Is The block to handle exception . It is followed by try and later finally.

       3. Finally : The Finally keyword is used to execute the important code of the program whether exception is handled or not.

       4. Throw :  It Is used to throw a Exception

       5. Throws : It Is used to declare a exception. iT DOESNOT throw an exception . it just states that there may be exception in the 
       method . It is always used with a method signature.

        // Few Exceptions Examples are as follows.

    */ 
    public static void main(String[] args)
    {
              //Arithmetic Exception 
              int a = 50/0  ;
              System.out.println(a);

              // Null Pointer Exception

              String s = null ;
             System.out.println(s.length());


              //  Array Index Out of bound Exception
              int arr[] = {10,20,30};
              for(int i=0;i<=3;i++)
              {
                  System.out.println(arr[i]);
              }
    }
}