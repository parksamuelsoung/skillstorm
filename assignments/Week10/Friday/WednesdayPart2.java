public class WednesdayPart2 {
    
    /*
     * Enthuware OCA Test 6 Review
     * 
     * 1. For test 6, the types of questions that were hardest for me were the
     *  "Working with Inheritance" questions. In particular, one question that I
     *  had difficulty understanding at first was question 2. There is one class,
     *  one abstract class, and one interface. The class Foo extends the abstract
     *  class and implements the interface. There are a few important facts I 
     *  learned from this question. When a class inherits from both an abstract
     *  class and interface: (1) the class now has the contract requirements of
     *  both the abstract class and interface, (2) methods defined in the abstract
     *  class are considered to be in the scope of the subclass even if not
     *  explicitly defined in the subclass, (3) the static modifier does not change
     *  a method's signature, thus two methods cannot have the same method
     *  signature if the only difference is the static modifier, (4) if a method 
     *  in the interface and a method in the abstract class have the same signature, 
     *  and both are inherited by a subclass, then the code will compile because 
     *  the abstract class's method is in the scope of the subclass, but lastly (5)
     *  if the method of the abstract class is modified with static, then the code
     *  will not compile because static methods are not inherited by subclass of
     *  interfaces. 
     * 
     * 2. A question I got right with an unclear understanding was question 30. It
     *  deals with working with inheritance, specifically with abstract classes.
     *  After reading the question again, looking at the difference choices, and
     *  reading an article, I learned a few important facts about abstract classes.
     *  (1) abstract classes can have both abstract and regular methods, (2) abstract
     *  methods can only be declared and not defined, so no body, (3) regular methods
     *  in abstract class can be defined with a body, (4) non-abstract class cannot
     *  declare abstract methods. 
     * 
     * 3. In addition to the Enthuware questions and explanations, one resource I
     *  used to get a clearer understanding of abstract classes was a GeekForGeek
     *  article on abstract class published here: 
     *  https://www.geeksforgeeks.org/abstract-classes-in-java/. I learned some other
     *  important facts such as an abstract class (1) is not required to have any
     *  abstract methods and can have only normal methods, (2) can have final methods,
     *  and (3) can have static methods as well. 
     * 
     */
}
