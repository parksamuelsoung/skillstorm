package Tuesday;

import java.util.Iterator;
import java.util.LinkedList;

public class Stack {

    public String reverse(String str) {
        LinkedList<Character> chars = new LinkedList<>();


        for (Character character : str.toCharArray()) {
            chars.push(character);
        }
        Iterator<Character> iterator = chars.listIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
        return chars.toString();
        
    }

    public boolean isBalanced(String expression) {
        LinkedList<Character> parenthesis = new LinkedList<>();
        int count = 0;

        for (Character character : expression.toCharArray()) {
            if (character == '(') {
                ++count;
            } else {
                --count;
            }
            parenthesis.push(character);
        }
        return count == 0;
    }

}