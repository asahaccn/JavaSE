import java.util.Scanner ;

import javax.lang.model.util.ElementScanner6;

public class profitloss {

    // profit loss check
    public static void main(String[] args)
    {
        int cp , sp , profit , loss;
        Scanner obj = new Scanner(System.in);

      System.out.println("Enter The Cost Price");
      cp = obj.nextInt();

      System.out.println("Enter The Selling Price");
      sp = obj.nextInt();

      if(sp>cp)
      {
          profit = sp - cp ;
          System.out.println("Profit earned is Rs :  " +profit);
      }
      else if(sp<cp)
      {
          loss =  cp - sp ;
        System.out.println("Loss incurred is Rs :  " +loss);
      }
      else
      {
        System.out.println("Nor Loss nor profit attained");
      }

}
    
}