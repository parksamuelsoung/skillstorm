package Monday;

public class Part3 {
    
    /*
     * 1. The HashCode-Equals contract is the relationship stating
     *    that both methods should be defined together. The equals
     *    method helps the hascode method determine the hashcode
     *    based on whether the comparing objects are equal or not.
     *    If the equals method determines that the objects are 
     *    equal, then the hashcode for both objects should be the
     *    same too. 
     * 
     * 2. Given that obj1 and obj2 have the same hashcode,
     *    obj1.equals(obj2) will always return true. Hashcodes are
     *    made deterministically, so they value of the fields in
     *    the objects determine the hashcode.
     * 
     * 3. The example implementation for a hashcode() method is
     *    not appropriate because it returns a random number
     *    instead of being deterministic and depending on the values
     *    within the object. There is also a chance that the method
     *    would return the same hashcode for unequal objects.
     * 
     * 
     */
}
