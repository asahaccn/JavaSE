public class countcharacters {
    
    // count the chracters in a string excluding blankspace
    public static void main(String[] args)
    {
        int count =  0;
        String s = "Hello World";
      
            //Counts each character except space    
            for(int i = 0; i < s.length(); i++) {    
                if(s.charAt(i) != ' ')    
                    count++;    
            }    
                
            //Displays the total number of characters present in the given string    
            System.out.println("Total number of characters in a string: " + count); 
        }
    }
   