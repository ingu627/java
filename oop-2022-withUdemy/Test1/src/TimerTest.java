import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

import javax.swing.Timer;



public class TimerTest {

    public static void main(String[] args){

        ActionListener listener = new TimePrinter();

        // construct a timer that calls the listener once every 10 seconds

//        Timer t = new Timer(1000, listener);
        Timer t = new Timer(1000, new ActionListener() {

            System.out.println("Hello World!");
        });

        t.start();

        JOptionPane.showMessageDialog(null, "Quit program?");

        System.exit(0);

    }

}



//class TimePrinter implements ActionListener {
//
//    public void actionPerformed(ActionEvent event) {
//
//        System.out.println("Hello World!");
//
//    }
//
//}