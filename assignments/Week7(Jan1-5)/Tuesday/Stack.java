package Tuesday;

import java.util.LinkedList;

public class Stack {

    public String reverse(String str) {
        LinkedList<Character> chars = new LinkedList<>();
        String reversed = "";

        for (Character character : str.toCharArray()) {
            chars.push(character);
        }

        while (!chars.isEmpty()) {
            reversed += chars.pop().toString();
        }
     
        return reversed;
        
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