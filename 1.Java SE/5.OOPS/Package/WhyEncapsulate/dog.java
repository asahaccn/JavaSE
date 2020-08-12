package simple ;

public class dog {
    
    private int height ;
    private String colour ;

  public void setheight(int height)
    {
        if(height>0)
        {
            this.height = height ; 
        }
       
    }

    

   public void setcolour(String colour)
    {
        this.colour = colour ;
    }

    public int getheight()
    {
      return height ;
    }

    public String getcolour()
    {
      return colour ;
    }
}
