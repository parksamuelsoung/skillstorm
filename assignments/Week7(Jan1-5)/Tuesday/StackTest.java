package Tuesday;

public class StackTest {
    
    public static void main(String[] args) {
        Stack stack = new Stack();

        System.out.println(stack.reverse("Hello"));

        System.out.println(stack.isBalanced("(())"));
    }
}
