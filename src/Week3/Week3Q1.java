package Week3;

public class Week3Q1 {
    public static void main(String[] args) {

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

    public static int countWords(String sentence) {
        int wordCount = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {

                wordCount++;
            }
        }
        return wordCount + 1;
    }
}