public class concatandupper {
    
    public static void main(String[] args)
    {
        String s1 = "Hello" ;
        String s2 = "World";
        String s3  =  s1 +  s2 ;
        String s4 = s1.concat(s2); // to concatenate two string.

        System.out.println("Concatenated string is: " +s3);
        System.out.println("Concatenated string is: " +s4);

        //to convert lowercase case letter to all uppercase.
        System.out.println("In Upper Case:  " +s4.toUpperCase());

    }
}