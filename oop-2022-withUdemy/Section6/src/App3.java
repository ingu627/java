public class App3 {

    /*
    equals(Object anObject) method: a comparison of values in the objects. e.g.: str1.equals(str2)
    intern() method: returns a canonical representation for the string object. e.g: str1.intern();

     */

    public static void main(String[] args) {

        String str1 = "Kevin";
        String str2 = " Spacey";

//        String result = str1+str2;
//        String result = str1.concat(str2);
        String str = "Hello world in Java!";
        String str3 = "    Hello world in Java!   ";
        String str4 = "this&is&going&to&be&splitted";

//        System.out.println(str.replaceAll("Java", "Python"));
        String[] strings = str.split("&",  6);

        for(String s : strings)
            System.out.println(s);

    }

}
