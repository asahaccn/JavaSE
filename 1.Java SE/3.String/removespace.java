public class removespace {
    
    // remove space from a String.
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentence = "Java Is Great" ;
		System.out.println("Original Sentence " +sentence);
		
         sentence  = sentence.replaceAll("\\s+", "");
		
		System.out.println("After Replacement : " + sentence);
		
		
	
	}
}