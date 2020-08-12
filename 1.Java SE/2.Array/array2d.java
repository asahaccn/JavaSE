public class array2d {
    
    //2d array 
    public static void main(String[] args)
    {

        int arr[][] = {{1,2,3} , {4,5,6} , {7,8,9}} ;
        int i , j ;

        for(i = 0 ; i<3 ; i++)
        {
            for(j = 0 ; j<3 ; j++)
            {
                System.out.println(arr[i][j]+ "");
            }

            System.out.println();
        }


    }
}