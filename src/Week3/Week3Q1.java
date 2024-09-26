package Week3;

<<<<<<< HEAD
public class Week3Q1 {
    public static void main(String[] args) {

=======
public class Week3Q1{
    public static void main(String[] args){
>>>>>>> e16b522f3df1a59757ec18e7b55f43539753890a
        System.out.println(countWords("The Quick Brown Fox Jumped Over the Lazy Dog"));
        System.out.println(countWords("Congrats on winning Merrimack!"));
        System.out.println(countWords("Hi Ben."));

        /*
         * Expected Output:
         * 9
         * 4
         * 2
         */
    }

<<<<<<< HEAD
    public static int countWords(String sentence) {
        int wordCount = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {

                wordCount++;
            }
        }
        return wordCount + 1;
=======
    // Create a function that counts the number of words in a sentence  
    public static int countWords(String sentence){
        //TODO: Complete the function!
        // *HINT: [String].charAt(index) will give you the character at the specified index
        //           Remember that the first element is at index 0
        return 0;
>>>>>>> e16b522f3df1a59757ec18e7b55f43539753890a
    }
}