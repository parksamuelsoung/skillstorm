public class Part2 {
    
    /*
     * OCA Test 1 Review
     * 
     * 1. The type of questions that were hardest for me were the
     *    "Working with Inheritance" questions. Particularly, I 
     *    had a difficult time with question 18. I tested the code 
     *    from the question in many ways in my vscode, and I learned
     *    a lot from it. I learned more about how to take the exam
     *    as well as how interfaces work with an inheriting class.
     *    The things I learned are (1) the focus of the question
     *    may not be obvious at first; the questions appears to be
     *    about implementing an interface, but the real issue was
     *    the compilation error, (2) the code not compile because
     *    the constructor wants to assign a variable called type, 
     *    but the variable type is not declared/initialized within the
     *    class, (3) the code will also not compile because the 
     *    variable type int within the interface is always public 
     *    static final which means it is a immutable constant from 
     *    outside the interface, (4) if the first compilation issue was 
     *    resolved by initializing the variable type with a type of int 
     *    within the constructor, the code will compile, run, not read 
     *    the variable type initialized within the constructor, read the 
     *    variable type from the interface, and print "jumping...0", (5) 
     *    if the second compilation issue was resolved by declaring the 
     *    variable type within the class instead of trying to reassign
     *    the interface's instance variable, which is not possible from 
     *    outside the interface, then the jump() method has the ability to 
     *    not read the interface's variable type, read the instance property 
     *    varable type, reassign the value using the constructor, and print 
     *    "jumping...1".
     * 
     * 2. Within the same category of inheritance, a question I got
     *    right with an unclear and insufficient reasoning was 
     *    question 21. At the very least, I knew that the object type 
     *    being instantiated was of Base2(), and the method within 
     *    the base2 class printed hello, so I got the question right.
     *    But I didn't realize what was happening within the entire
     *    inheritence tree. Base2 is a subclass of base. They both
     *    have the same method. The return type of the superclass is
     *    object, and the return type of the subclass is string. If
     *    the return type of the superclass was not either Object or
     *    String, then the method of the subclass would not be able
     *    to override the method. This would have resulted in a 
     *    compilation error. Also, as a side note, I thought that 
     *    having the @Override annotation was required, but it is not.
     * 
     * 3. One resouce I learned a lot from is a Youtube video called,
     *    ""Covariant returns" example. (enthuware.ocajp.i.v8.2.1086)".
     *    Dr. Sean Kennedy shows a diagram of the inheritance tree of 
     *    Base, Object getValue(), Base2 extends Base, String getValue(),
     *    covariant return types, and overridden methods. As a side note,
     *    primitives are not allowed unless the superclass has a return 
     *    type of the respective wrapper class. The link to this video
     *    is found in the explanation of question 21 and also shared with
     *    peers on discord. 
     * 
     */
}
