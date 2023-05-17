public class OutsideClass2 {

   public static String msg = "Hellow world!";

   static class NestedClass2 {

       public void showMsg() {
           System.out.println(msg);
       }
   }
}
