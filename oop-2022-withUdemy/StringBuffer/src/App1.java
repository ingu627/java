public class App1 {

    public static void main(String[] args) {
    /*
    charAt(), indexOf(), length(), and substring() These methods work exactly the same as in the String class.

    append()
    This method is by far the most frequently used method in StringBuilder. Let's see method chaining with append!
     */

        StringBuilder strBuilder = new StringBuilder("Wall Street");
        strBuilder = strBuilder.append(12).append(", ").append("New York");
        System.out.println(strBuilder);

    /*
    insert()
    This method adds characters to the StringBuilder at the requested index and returns a reference to
    the current StringBuilder.
     */
        System.out.println(strBuilder.insert(15, " 5th floor, "));

    /*
    delete()
    This method removes the characters in a substring of this sequence.
     */
        System.out.println(strBuilder.delete(15, 26));

    /*
    reverse()
    This method causes this character sequence to be replaced by the reverse of the sequence.
     */
        System.out.println(strBuilder.reverse());

    /*
    toString()
    Often StringBuilder is used internally for performance purposes but the end result needs to be a String.
    For example, maybe it needs to be passed to another method that is expecting a String
     */
        String s = strBuilder.toString();

    /*
    You can find other methods of String Class in the Java API documentation.
     */


    }

}
