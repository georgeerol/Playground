package coderbyte.easy;

/**
 * Have a function that takes  a string and return the number of words the string contains.
 * Created by fouli on 8/6/2017.
 */
public class WordCount {
    public int countsWord(String sentence) {
        String[] words = sentence.split(" ");
        return words.length;
    }
}
