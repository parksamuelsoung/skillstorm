
public class MondayRecursion {

    public static int sumEvens(int start, int end) {

        if (start == end) {
            return 0;
        }

        if (start > end) {
            throw new IllegalArgumentException("The starting number cannot be greater than the end.");
        } else if (start % 2 != 0) {
            start++;
        } else if (end % 2 != 0) {
            end--;
        }

        return start + sumEvens(start + 2, end);
    }

    public static boolean containsLarger(int[] nums, int n, int fromIndex) {
        
        if (fromIndex == nums.length - 1) {
            return false;
        }

        if (n < nums[fromIndex] ) {
            return true;
        }

        return containsLarger(nums, n, ++fromIndex);
    }

    public static void main(String[] args) {

        // Problem 1:
        try {
            System.out.println(sumEvens(2, 0));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(sumEvens(0, 6));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Problem 2:
        int[] tens = new int[]{100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
        System.out.println(containsLarger(tens, 50, 0));
        System.out.println(containsLarger(tens, 50, 5));

    }
}