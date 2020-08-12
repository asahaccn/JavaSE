// anonymous means nameless
 // anonymous objects does not have any reference varaiable , they are created at the of object creation only.
 //  ex : new Calculator();
 // and can be used as new Calculator().fact(5);

 // example 

 class Calculation
 {
      void fact(int n)
      {
          int fact = 1;
          for(int i=1 ; i<=n;i++)
          {
              fact = fact * i ;
          }

          System.out.println("Factorial is : " +fact);
      }
 }

  class CalculationTest
  {
      public static void main(String[] args)
      {
        new Calculation().fact(5);
      }
  }