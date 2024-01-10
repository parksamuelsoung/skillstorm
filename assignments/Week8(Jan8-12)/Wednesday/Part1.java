import java.util.HashMap;

public class Part1 {

    public static void main(String[] args) {
        
        String sentence1 = "The quick brown fox jumps over the lazy dog.";
        String sentence2 = "Testing 1 2 3 4 ... testing 1 2 3 4";

        System.out.println("Sentence 1 Letter Map: " + countLetters(sentence1));
        System.out.println("Sentence 2 Letter Map: " + countLetters(sentence2));        

    }

    public static HashMap<Character, Integer> countLetters(String str) {
        HashMap<Character, Integer> lettersMap = new HashMap<>();
        for (Character character : str.toCharArray()) {
            if (Character.isAlphabetic(character)) {
                if (lettersMap.containsKey(character)) {
                    lettersMap.replace(character, lettersMap.get(character) + 1);
                } else {
                    lettersMap.putIfAbsent(character, 1);
                }
            }
        }
        return lettersMap;
    }
}