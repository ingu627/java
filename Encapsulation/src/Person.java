public class Person {

    private String name;
    private int age;

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            throw new IllegalArgumentException("Age parameter cannot be smaller than 0!");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person: " +this.age + " - " +this.name;
    }
}
