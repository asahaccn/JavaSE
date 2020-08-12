// multiple inheritance is supported by Interface is java

//example 1:
interface A
 {
  public void show();
 }

 interface B
 {
   public void show();
 }

 class A7 implements A,B
 {
     public void show()
     {
         System.out.println("Showing!");
     }
     public static void main(String[] args)
     {
        A7 obj = new A7();
        obj.show(); //showing
     }
 }

 //Example 2:

 interface Printable{  
    void print();  
    }  
    interface Showable{  
    void show();  
    }  
    class A7 implements Printable,Showable{  
    public void print(){System.out.println("Hello");}  
    public void show(){System.out.println("Welcome");}  
      
    public static void main(String args[]){  
    A7 obj = new A7();  
    obj.print();  
    obj.show();  
     }  

    // Interface Inheritance

    interface Printable{  
        void print();  
        }  
        interface Showable extends Printable{  
        void show();  
        }  
        class TestInterface4 implements Showable{  
        public void print(){System.out.println("Hello");}  
        public void show(){System.out.println("Welcome");}  
          
        public static void main(String args[]){  
        TestInterface4 obj = new TestInterface4();  
        obj.print();  
        obj.show();  
         }  
        }  