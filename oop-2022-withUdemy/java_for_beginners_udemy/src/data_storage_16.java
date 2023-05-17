public class data_storage_16 {
    public static void main(String[] args) {
        double[] Data = new double[4];
        Data[0] = 1.5;
        Data[1] = 3.34;
        Data[2] = 5;
        Data[3] = 4;

        String[] Data2 = new String[2];
        Data2[0] = "pizza";
        Data2[1] = "burger";

        if (Data[0]>Data[2]) {
            System.out.println(Data[0] + " is greater than " + Data[2]);
        }
        else {
            System.out.println(Data[2] + " is greater than " + Data[0]);
        }
    }
}
