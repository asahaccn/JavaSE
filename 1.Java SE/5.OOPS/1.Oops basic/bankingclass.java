/* We will understand objects and classes in a greaterdetail using a real world example buy using a banking class which 
   contains data members accno  , name and amount ...we use method to intialise the object and other behaviour include d
   deposit() , withdrawl() and checkbalance()

*/

// class and object with a real world example Account
class Account {
    
        int acc_no ; // field // data members // instance variable.
        String name ;
        float amount ;

        void insert(int ano ,  String n , float amt) // method to intialise the object of the class.
        {
            acc_no = ano ;
            name = n ;
            amount = amt ;
        }

        void deposit(float amt)
        {
            amount = amount + amt; // amt is amount deposited and total balance is amount = previous balance + amt
            System.out.println(amt+ " Deposited " ); 
        }

        void withdraw(float amt)
        {
           if(amount<amt) // withdrawl amount is given amt if amt is more than current balance is withdrawl is rejected
           {
               System.out.println("Insufficient Balance");
           }
           else 
           {
                amount = amount - amt ; // if withdrawal amount is less than current balance withdrawal is accepted
               System.out.println(amt+ "Withdraw"); // current balance is set as amount = amount - amt ;
              
           }
        }

        void checkbalance()
        {
            System.out.println(amount+ " Avaiable Balance");
        }

        void display() // to print the value
        {
            System.out.println(acc_no+ " " +name+ " " +amount);
        }
            
        }

    
        class Account1
        {
            public static void main(String[] args)
            {
                Account obj = new Account();
                obj.insert(101,"Ashley",15000);
                obj.display(); // 101 , "Ashley" , 15000 // to access data using reference variable
                obj.checkbalance(); // 15000

                obj.deposit(10000); // 10000
                obj.checkbalance(); //15000+10000 = 25000

                obj.withdraw(5000); //5000 since 5000 is less than 25000 so withdrawl is accepted
                obj.checkbalance(); // 20000
            }
        }
    
