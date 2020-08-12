public class arraymethod {
    
    // psassing a array to a method
    public static void minimum(int arr[])
    {
       int min ;
       min = arr[0] ;
       for(int i = 0 ; i<arr.length ; i++)
       {
           if(min>arr[i])
            min = arr[i] ;

            System.out.println(min);
       }


    }

    public static void main(String[] args)
    
    {
        int array[] = {10,2,1,0,6};
        minimum(array);
    }
}