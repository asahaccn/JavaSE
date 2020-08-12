public class alljavaoperators {
    
    public static void main(String[] args)
     {
         // unary operator  // postfix and prefix
         //example 1 :
        /* int x = 10 ;
         System.out.println(x++);//10(11)
         System.out.println(++x);//12
         System.out.println(x--);//12(11)
         System.out.println(--x);//10

         // in case of pre increment or decrement first the value gets updated and then it prints wheras in case 
         // of post increment the value gets print first then it is updated.

         // example 2 :
        int a = 10 ;
        int b = 10 ;
        System.out.println(a++ + ++a);//10 + 12 = 22
        System.out.println(b++ + b++);//10 + 11 = 21
         System.out.println(a++ + ++b); // 12 + 13 = 25
        System.out.println(b++ + b++); // 13 + 14 = 27*/


        /*java Arithmetic operator 


        example 1
        int a = 10 ;
         int b = 20 ;
         System.out.println(a+b);
         System.out.println(a-b);
         System.out.println(a*b);
         System.out.println(b/a);  
         System.out.println(b%a);*/

         //shift oparator

         //java left shift operator : shifts the value in bits according to the number given leftwise

        /* System.out.println(10<<2);//10*2^2=10*4=40
         System.out.println(10<<3);//10*2^3=10*8=80
         System.out.println(20<<2);//20*2^2=20*4=80
         System.out.println(15<<3);//15*2^3=15*8=120*/

         //  java right shift operator : shifts the value in bits according to the number given rightwise

       /*   System.out.println(10>>2);//10/2^2=10/4=2
         System.out.println(10>>3);//10/2^3=10/8=1
         System.out.println(20>>2);//20/2^2=20/4=5
         System.out.println(15>>3);//15/2^3=15/8=1*/

        // >>> operator 

        /* for positive number >> and  >>> is same
        System.out.println(20>>2) ; // 20/2^2=20/4=5
        System.out.println(20>>>2) ; // 20/2^2=20/4=5

        for neagative number >>> change the parity bit(msb) to 0 
        System.out.println(-20>>2) ;
        System.out.println(-20>>>2) ; */

         // java AND Operator
     /*logical && and bitwise & : the difference is that logical && only checks the first value if the first value 
     if the first value is false it does not checks the second value wheras bitwise & checks the second value even if the first value is
     false 
       
     //example 1
     int a = 10 ;
     int b = 20 ;
     int c = 5 ;

     System.out.println(a>b && c<b); // logical and operator //  false && true = false
     System.out.println(a>b & c<b);  // bitwise and operator //  false && true = false
     

     // example 2 java and operator  to make the differnce more clear 

     int a = 10 ;
     int b = 5 ;
     int c = 20  ;

     System.out.println(a<b && a++<c);//false && true = false
     System.out.println(a);//10 as the second condition is not checked if first condition is false in case of logical &&
     System.out.println(a<b && a++<c));//false && true = false
     System.out.println(a);//11 as the second condition is checked even if first condition is false in case of bitwise &
*/

// JAVA OR operator //  logical || and Bitwise |

/*
 Logical || does not check the second condition if the first one is true and if the first one is false then it 
 checks the second one

 Bitwise | irrespective the first condition being true or false it checks the second condition.
 
  Example 1 :

   int a = 10 ;
   int b = 20 ;
   int c  = 5 ;

   System.out.println(a>b || c<b ); //false || true =  true
   System.out.println(a>b | c<b ); //false | true = true 

  // Example 2:

   int a = 10 ;
   int b = 5 ;
   int c = 20 ;

   System.out.println(a>b || a++<c); // true || true = true
   System.out.println(a); // 10as the second condition is not checked if first condition is true in case of logical ||
   System.out.println(a>b | a++<c); // true || true = true
   System.out.println(a); // 11 as the second condition is checked irrespective first condition is true or false in case 
   //of bitwise |
*/

// Ternary operator / Conditional operator (? :)

  /* int a = 10 ;
   int b = 20 ;
   int min = (a>b) ? a : b ;
   System.out.println(min);*/

   // Java assignment operator : = , += , -= , *= , /= , %= , &=, ^= , |= , <<= , >>= , >>>=

  // Example 1:

  /* int a =  10 ;
   int b = 20 ;
   a+=4;//a=a+4//a=10+4=14
   b-=4;//b=b-4//20-4=16
   System.out.println(a);//14
   System.out.println(b);//16

   // example 2 :

   int a = 10 ;
   int b = 20 ;
   a+=4;//10+4=14
   b-=4;//20-4=16
   a*=9;//14*9=126
   b/=12;//16/12=1
   a%=10;//126%10=6
   System.out.println(a);//6
   System.out.println(b);//1 */

   // Example 3: using short
   
  /* short a = 10 ;
   short b = 20 ;

  // a+=b; internally so fine 
   a = a+b  ; // 10+20=30 but during compile time it will give error since 10+20=30  which is int type not byte.
 System.out.println(a); //error //cannot convert from int to short

 // how to solve the type conversion error
 a = (short)(a+b); // typecast or narrowing
 System.out.println(a);//30//no error */
        
        
        

         }
    
}