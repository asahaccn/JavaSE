public class matrixmultiplicationarray {

    // matrix multiplication in array
    public static void main(String[] args)
    {
        int i , j , k ;
        int a[][] = {{1,2,3} , {4,5,6} , {7,8,9}} ;
        int b[][] = {{10,11,12} , {14,15,16} , {17,18,19}} ;
        int c[][] = new int[3][3] ;

        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                c[i][j] = 0;
                for(k=0;k<3;k++)
                {
                    c[i][j] = a[i][k] * b[k][j] ;
                    System.out.println(c[i][j]+ "");
                }
             

            }
          System.out.println();
            
        }
    }
    
}