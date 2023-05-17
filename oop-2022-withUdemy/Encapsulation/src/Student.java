public class Student {

    private int age;
    private String name;
    private String university;

    public Student() {

    }

    public Student(int age, String name, String university) {
        this.age = age;
        this.name = name;
        this.university = university;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}
