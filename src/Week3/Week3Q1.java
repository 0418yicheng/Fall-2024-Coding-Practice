package Week3;

public class Week3Q1{
    public static void main(){
        System.out.println(countWords("The Quick Brown Fox Jumped Over the Lazy Dog"));
        System.out.println(countWords("Congrats on winning Merrimack!"));
        System.out.println(countWords("Hi Ben."));

        System.out.println(altSolution("The Quick Brown Fox Jumped Over the Lazy Dog"));
        System.out.println(altSolution("Congrats on winning Merrimack!"));
        System.out.println(altSolution("Hi Ben."));

        /*
         * Expected Output:
         *  9
         *  4
         *  2
         */
    }

    // Create a function that counts the number of words in a sentence  
    public static int countWords(String sentence){
        //TODO: Complete the function!
        // *HINT: [String].charAt(index) will give you the character at the specified index
        //           Remember that the first element is at index 0

        int count = 0;
        for(int i = 0; i < sentence.length(); i++){
            if(sentence.charAt(i) == ' '){
                count ++;
            }
        }
        count ++;   //Accounts for the last word

        return count;
    }

    public static int altSolution(String sentence){
        String[] temp = sentence.split(" ");
        return temp.length;
    }
}