public class App2 {

    public static void main(String[] args) {

        /*
        intern() method
        Returns a canonical representation for the string object. Intern() method saves memory

        When the intern method is invoked, if the pool already contains a string equal to this String object,
        then the string from the pool is returned. Otherwise, this String object is added to the pool and a reference to this String objet is returned.

        Keep in mind, that Java automatically interns String literals.
        (So in the background String = "abc"; is equal String = "abc".intern;

        This means that the intern() method is to be used on Strings that are constructed with new String()
         */

        String constantString = "Kevin";

        String newString = new String("Kevin");
        System.out.println(constantString==newString);
        System.out.println(constantString.equals(newString));

        newString = newString.intern();
        System.out.println(constantString==newString);
        System.out.println(constantString.equals(newString));

        /*
        What happened in the background?
            before: newString was pointing to the Heap to an object which value was "Kevin"
            after intern: newString is pointing to the String Constant Pool to an object which value is "Kevin"
            so after intern constantString and newString are pointing to the same object in the Pool
         */
    }
}
