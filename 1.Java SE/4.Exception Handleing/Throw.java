public class Throw {
    
   // Throw block : The Throw block in java in used to explicitly throw a exception .
  //   It does'nt exists on it's own it is followed by catch or final block.
    
  // in this example 

     public static void validate( int age)
     {
        
         if(age<18)
          throw new ArithmeticException("Not Valid");
          else
          System.out.println("Allowed to vote");
     }
    public static void main(String[] args)
    {
        validate(15);
       System.out.println("Rest Of The Code..");

       // output : Exception in thread "main" java.lang.ArithmeticException: Not Valid
    }
}