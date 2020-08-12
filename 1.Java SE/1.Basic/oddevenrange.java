import java.util.Scanner ;

public class oddevenrange {

    // to display odd numbers and even numbers within a range
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int high,low ,even , odd;

        System.out.println("Enter The Low Limit");
        low = obj.nextInt();

        System.out.println("Enter The High Limit");
        high = obj.nextInt();

        System.out.println("Even Numbers Between " +low+ " and " +high+ " are as follows :");
        for(int i=low;i<=high;i++)
        {
              if(i%2==0)
              {
                  System.out.println(i);
              }
        }

        System.out.println("Odd Numbers Between " +low+ " and " +high+ " are as follows :");
        for(int i=low;i<=high;i++)
        {
              if(i%2!=0)
              {
                  System.out.println(i);
              }
        }

    }
    
}