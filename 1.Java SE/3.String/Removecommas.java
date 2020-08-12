public class Removecommas {
    
    // STRING SPLITTING FROM CSV.
    public static void main(String[] args)
    {
        String s = "Messi , Ronaldo , Bale , Suarez" ;
        String name[] = s.split(",");
        System.out.println("String Splitting from CSV values are : " + name[1]); // Ronaldo
    }
}