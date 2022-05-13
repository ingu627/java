import java.io.*;

public class App {
    public static void main(String[] args) throws ClassNotFoundException{

        Ford car = new Ford("Ford",12345,"blue", "Focus");

        // SERIALIZATION

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("serialization.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(car);

            objectOutputStream.close();
            fileOutputStream.close();

            System.out.println("Car object has been serialized...");


        } catch (IOException e) {
            e.printStackTrace();
        }

        // DESERIALIZATION

        try {

            FileInputStream fileInputStream = new FileInputStream("serialization.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            Car deserializedCar = (Car) objectInputStream.readObject();

            fileInputStream.close();
            objectInputStream.close();

            System.out.println(deserializedCar);

            System.out.println("Car object has been deserialized...");


        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
