/*Simple example of command-line argument in java
In this example, we are receiving only one argument and printing it. To run this java program, you must pass at least one argument from the command prompt.

    class CommandLineExample{  
    public static void main(String args[]){  
    System.out.println("Your first argument is: "+args[0]);  
    }  
    }  

    compile by > javac CommandLineExample.java  
    run by > java CommandLineExample sonoo  

Output: Your first argument is: sonoo

Example of command-line argument that prints all the values
In this example, we are printing all the arguments passed from the command-line. For this purpose, we have traversed the array using for loop.

    class A{  
    public static void main(String args[]){  
      
    for(int i=0;i<args.length;i++)  
    System.out.println(args[i]);  
      
    }  
    }  

    compile by > javac A.java  
    run by > java A sonoo jaiswal 1 3 abc  

Output: sonoo
       jaiswal
       1
       3
       abc
      */
