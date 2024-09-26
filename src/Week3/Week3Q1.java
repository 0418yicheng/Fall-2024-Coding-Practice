package Week3;

public class Week3Q1{
    public static void main(String[] args){
        System.out.println(countWords("The Quick Brown Fox Jumped Over the Lazy Dog"));
        System.out.println(countWords("Congrats on winning Merrimack!"));
        System.out.println(countWords("Hi Ben."));

        /*
         * Expected Output:
         *  9
         *  4
         *  2
         */
    }

    // Create a function that counts the number of words in a sentence  
    public static int countWords(String sentence){
        int words = 1;

        for(int i = 0; i < sentence.length(); i++){
            char x = ' ';
            if(sentence.charAt(i) == x){
                words++;
            }
        }
        
        return words;
        //TODO: Complete the function!
        // *HINT: [String].charAt(index) will give you the character at the specified index
        //           Remember that the first element is at index 0
    }
}