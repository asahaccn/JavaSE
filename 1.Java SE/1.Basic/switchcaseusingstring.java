public class switchcaseusingstring {
    
    public static void main(String[] args) {
      // Switch case using String
      String levelString = "";
      int level = 0 ;

      switch(levelString)
    {
        case "Beginner" :
         level = 1;
        break;

        case "Intermediate" : 
        level = 2;
        break;

        case "Expert" : 
        level = 3;
        break;

        default: 
        level = 0;
        break;
    }
        System.out.println("Your level is " +level);
    }
}