public class Part2 {
    
    /*
     * 
     * Enthuware OCA Test 7 Review
     * 
     * 1. For test 7, the hardest questions for me were questions from the 
     *  "Handling Exceptions" category. I missed all of the questions
     *  (23, 24, 29, 39) from this category due to a similar reason. The main
     *  reason is that I wasn't clear on what was and what was not allowed.
     *  Also, what would and would not comile. I learned that an exception 
     *  can be thrown in any part of the try-catch-finally block and still
     *  compile just fine. I also realized that exceptions are just objects,
     *  and they can be intialized to null. If an exception is initialized
     *  to null and thrown, then this will cause a NullPointerException to
     *  be thrown. 
     * 
     * 2. A question I nearly got right is question 29 from above. I was 
     *  two-thirds correct, since the question was "select all that apply".
     *  With this question in particular, I learned more about the precedance
     *  of exceptions. Within a try-catch-finally block, the exception that
     *  was thrown most recently will be the exception thrown to the caller
     *  from the method. For example(1), if an exception is thrown in the try
     *  block, it was not caught by the catch block, the finally block
     *  also throws an exception, then the exception in the finally block will
     *  be the exception thrown to the caller by the method. For example(2),
     *  if an exception is thrown in the try block, it was caught by the catch
     *  block, the catch block also throws an exception, the finally block also
     *  throws and exception, then the exception in the finally block will 
     *  still be the exception thrown to the caller by the method. For example(3),
     *  if not exception is thrown in the try block, if there is a finally block,
     *  the control will go to the finally block, if the finally block throws an
     *  exception, then this exception will be thrown to the caller by the method.
     * 
     * 3. One resource I found to learn more about the try-catch-finally block 
     *  and exception handling is this article on Mozilla web docs published here:
     *  https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/try...catch.
     *  Actually, it was difficult to find a resource for the specific issue I 
     *  was looking for. But, this article talks about the shift of control from
     *  the try block to the catch block and finally the finally block. Reading about
     *  the shift of control was helpful.
     */
}
