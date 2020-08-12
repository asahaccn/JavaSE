// Reverse String by words in java.
// I love india will be india loves me .

   
   class Revbywords
        {
    public static void main(String[] args) {
        String sentence="Welcome to java";
        System.out.println(reverseByWords(sentence));
    }
    public static String reverseByWords(String sentence){
        String[] s=sentence.split(" ");
        String out="";
        for (int i=s.length()-1;i>=0;i--){
            out+=s[i]+"";
        }
        return out;
    }
