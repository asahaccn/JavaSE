//javastrictfp keyword ensures that we will get the same floating data type value (precision) in every platform.

/*
Legal Code for strictp keyword
    strictfp class A{}//strictfp applied on class  
   strictfp interface M{}//strictfp applied on interface  

    class A{  
    strictfp void m(){}//strictfp applied on method  
    }  
*/ 

/* Illegal code for strictp
    class B{  
    strictfp abstract void m();//Illegal combination of modifiers  
    }  

    class B{  
    strictfp int data=10;//modifier strictfp not allowed here  
    }  

    class B{  
    strictfp B(){}//modifier strictfp not allowed here  
    }  

*/