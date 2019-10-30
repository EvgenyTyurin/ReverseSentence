/**
 * Reverse sentence by words
 */

public class ReverseWords {

    public static void main(String[] args) {
        // test str
        String str = "Veni vidi vici";
        // array of words from str
        String[] words = str.split(" ");
        // build new string from words array beginning from the end
        StringBuilder stringBuilder = new StringBuilder();
        for (int idx = words.length - 1; idx >= 0; idx--) {
            stringBuilder.append(words[idx]).append(" ");
        }
        // delete last space
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        // print result
        System.out.println(stringBuilder); // vici vidi Veni
    }
}
