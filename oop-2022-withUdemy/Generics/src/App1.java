class Box<T> {

    private T element;

    public Box(T element) {
        this.element = element;
    }

    public T getElement() {
        return this.element;
    }

    public void setElement(T element) {
        this.element = element;
    }
}

public class App1 {

    public static void main(String[] args) {

        Box<String> box1 = new Box<>("Adam");
        System.out.println(box1.getElement());


    }
}
