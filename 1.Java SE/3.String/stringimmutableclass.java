public class stringimmutableclass
    {

        /*There are many immutable class like string,boolean,byte,short,int,long,float and double. so all
        wrapper and string class are immutable . We can create immutable class by creating final class with
        final data memebers */

        
            // in this example we will create a final class with a final data member , parameterised constructor 
            // and a getetr method

            public final class Employee(int pancardnumber)
            {
                final String pancardnumber;
    
                public Employee(String pancardnumber)
                {
                    this.pancardnumber = pancardnumber;
                }

                public String pancardnumber()
                {
                    return pancardnumber ;
                }
            // the above class is immutable beacuse :

            /*1. the instance value of the class is final so we cannot change the value after creating object.
            2.Class is final so no new sub class can be created 
            3.there is only getter method no setter so no change in the value of the instance variable.*/
        
    }