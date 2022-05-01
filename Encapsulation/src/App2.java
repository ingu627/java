public class App2 {

    /*
    JavaBeans (or POJO - plain old java object)
    JavaBeans are classes that encapsulate many objects into a single object (the bean).

    1.) Must implement Serializable

    2.) It should have a public zero-argument constructor (default constructor)

    3.) All properties must be private and allow access to properties using getter and setter methods

     */

    public static void main(String[] args){

        JavaBeanExample javaBeanExample = new JavaBeanExample();
        javaBeanExample.setId(1);
        javaBeanExample.setName("Java Bean 1");

        System.out.println(javaBeanExample);
    }


}
