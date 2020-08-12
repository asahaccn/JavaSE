//The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive
Wrapper class Example: Primitive to Wrapper


autoboxing:

    //Java program to convert primitive into objects  
    //Autoboxing example of int to Integer  
    public class WrapperExample1{  
    public static void main(String args[]){  
    //Converting int into Integer  
    int a=20;  
    Integer i=Integer.valueOf(a);//converting int into Integer explicitly  
    Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally  
      
    System.out.println(a+" "+i+" "+j);  
    }}  

    Unboxing : 

        //Java program to convert object into primitives  
    //Unboxing example of Integer to int  
    public class WrapperExample2{    
        public static void main(String args[]){    
        //Converting Integer to int    
        Integer a=new Integer(3);    
        int i=a.intValue();//converting Integer to int explicitly  
        int j=a;//unboxing, now compiler will write a.intValue() internally    
            
        System.out.println(a+" "+i+" "+j);    
        }}    