// java supports call by value not call by reference.

//call by refernce

class Test
 {
     int data =  50 ;

     public void change(int data)
     {
       data = data + 100;
     }

     public static void main(String args[])
     {
         Test op = new Test();

  System.out.println("before change "+op.data);  
   op.change(500);  
   System.out.println("after change "+op.data);  

   //it is known as call by value. The changes being done in the called method, is not affected in the calling method. 
   // any change in the formal argument will not change value in the formal argument.
 }
}