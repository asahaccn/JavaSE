public class arrayclass {
    // in java array is treated as object so a proxy class is created 
    // for the array  we can get the name of the class by getClass() , getName() method.
    public static void main(String[] args)
    {
        int arr[] = {10,20,30,40,50} ;

        Class c = arr.getClass();
        String name = c.getName();

        System.out.println(name);
    }
}