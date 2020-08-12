

import java.util.Scanner;
public class validtriangleornot {

    public static  void main(String[] args)
    {
       int side1,side2,side3 ;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter The First side");
         side1 = obj.nextInt();
       
        System.out.println("Enter The Second side");
        side2 = obj.nextInt();

        System.out.println("Enter The Third side");
        side3 = obj.nextInt();

        if(side1 + side2 > side3)
        {
            System.out.println("Given Triangle Is Valid");
        }
        
        else if(side2 + side3 > side1)
        {
            System.out.println("Given Triangle Is Valid");
        }

        else if(side3 + side1 > side2)
        {
            System.out.println("Given Triangle Is Valid");
        }
        else 
        {
            System.out.println("Given Triangle Is InValid");
        }
       
    }
    
}