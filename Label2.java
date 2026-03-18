package com.mycompany.label2;
import java.awt.*;
import java.awt.event.*;
public class Label2 {

    public static void main(String[] args) {
         Frame frame = new Frame("My First App");
        frame.setLayout(null);
        frame.setSize(350, 250);
        
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        Label lbl1 = new Label("Hello World!");
        lbl1.setName("label1");
        lbl1.setBounds(100, 50, 150, 20);
        
        Label lbl2 = new Label("I love programming");
        lbl2.setName("label2");
        lbl2.setBounds(85, 90, 200, 20);
        
        Label lbl3 = new Label("I love CodeChum");
        lbl3.setName("label3");
        lbl3.setBounds(85, 130, 200, 20);
        
        Label lbl4 = new Label("I love Java");
        lbl4.setName("label4");
        lbl4.setBounds(100, 170, 150, 20);
        
        frame.add(lbl1);
        frame.add(lbl2);
        frame.add(lbl3);
        frame.add(lbl4);
        
        frame.setVisible(true);
    }
}
