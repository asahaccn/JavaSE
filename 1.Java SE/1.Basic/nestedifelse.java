public class nestedifelse {
    
    // nested  if else // IF within IF
    public static void main(String[] args)
      {

        

        int age = 16 ;
        int weight = 60 ;

          if(weight>55)
          {
              if(age>=18)
              {
                System.out.println("You are allowed to vote");
              }
              else 
              {
                System.out.println("Not Allowed to donate blood since age is not 18 yet");
              }
              
          }
          else 
                 System.out.println("Not Allowed to donate blood since weight is less than 55");
                
            
          
      }
}