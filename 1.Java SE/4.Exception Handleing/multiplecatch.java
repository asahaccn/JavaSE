public class multiplecatch {
    
    // the try block can be followed by multiple catch block . each catch block is created and act as differnt
    // exception handler . 
    // so at a time only one exception occurs and at a time only one catch block is created.
     // and  all catch block must be ordered from most specific to most general i.e ArithmeticException 
     // should come before normal exception .


    public static void main(String[] args)

   
    {
        //  example 1:
      /*  try {
            int arr[] = new int[5];
            arr[5] = 30/0 ;
        }

        catch(ArithmeticException e) // exception from specific to general (high pririty to low)
        {
            System.out.println("Arithmetic Exception Ocurrs");
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundException Ocurrs");
        }

        
        catch(Exception e)
        {
            System.out.println("Parent Exception Ocuurs");
        }

        System.out.println("Rest Of The Code");*/

        // output: Arithmetic Exception Ocurrs
                  //  Rest Of The Code



        //  example 2: // here more prority is array index out of bound so its exception occurs
    

     /* try {
            int arr[] = new int[5];
            System.out.println(arr[10]) ;
        }

       

        catch(ArrayIndexOutOfBoundsException e)// exception from specific to general (high pririty to low)
        {
            System.out.println("ArrayIndexOutOfBoundException Ocurrs");
        }
        

        
        catch(Exception e)
        {
            System.out.println("Parent Exception Ocurrs");
        }

        System.out.println("Rest Of The Code"); */

        // output: ArrayIndexOutOfBoundException Ocurrs
                    //Rest Of The Code

    
        // Example 3: If try block contains 2  exception but at a time only one exception occurs and its subsiquent
        // catch block is invoked.

      /*  try {
            int arr[] = new int[5];
            arr[5] = 30/0;
           System.out.println(arr[10]) ;
        }

       catch(ArithmeticException e)// exception from specific to general (high pririty to low)
       {
           System.out.println("Arithmetic Exception Ocurrs");
       }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundException Ocurrs");
        }

        
        catch(Exception e)
        {
            System.out.println("Parent Exception Ocurrs");
        }

        System.out.println("Rest Of The Code");*/

        // output: Arithmetic Exception Ocurrs
                   // Rest Of The Code



      // Example 4: in this case if there is a nullpointer exception but we do not create the specified catch block
     // then the parent exception is returned.

       /* try {
            String s = null ;
           System.out.println(s.length()) ;
        }

       catch(ArithmeticException e)// exception from specific to general (high pririty to low)
       {
          System.out.println("Arithmetic Exception Ocurrs");
       }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundException Ocurrs");
        }

        
        catch(Exception e)
        {
            System.out.println("Parent Exception Ocurrs");//("Parent Execption Occurs");
         
        }

        System.out.println("Rest Of The Code");*/

        // output: Parent Exception Ocuurs
                    //Rest Of The Code

    

     // Example 5: if the catch block order ocurrence is not maintained then compile error is thrown.

       /* try {
           int arr[] - new int[5];
           arr[5] = 30/0;
        }


           catch(Exception e)
        {
            System.out.println("Parent Exception Ocurrs");
        }

     
        catch(ArrayIndexOutOfBoundException e)
        {
            System.out.println("ArrayIndexOutOfBoundException Ocurrs");
        }

          catch(ArithmeticException e)
       {
        System.out.println("Arithmetic Exception Ocurrs");
       }

          System.out.println("Rest Of The Code");*/

        // output: compile time error. 

        

                
    }
}