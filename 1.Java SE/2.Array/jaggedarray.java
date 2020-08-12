public class jaggedarray {
    
    // jagged array : jagged array in java  are array with odd number of columns different size columns.
    public static void main(String[] args)
    {
        // declareing a 2d array with odd columns 
        
     int arr[][] =   new int[3][];
     arr[0] = new int[3] ;
     arr[1] = new int[4] ;
     arr[2] = new int[5] ;

       // intialising the jagged array
       int count = 0 ;
      for(int i = 0; i<arr.length;i++)
      {
          for(int j = 0 ; j<arr.length;j++)
          {
             arr[i][j] = count++;
          }
      }
      
      //displaying the data in the  jagged array

      for(int i = 0; i<arr.length;i++)
      {
          for(int j = 0 ; j<arr.length;j++)
          {
             System.out.println(arr[i][j]+ "");
          }
          System.out.println();
      }
    }
}

    
