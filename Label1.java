package com.mycompany.label1;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author abari
 */
public class Label1 {

    public static void main(String[] args) {
        Frame frame = new Frame("Hello World!");
        frame.setLayout(null);
        frame.setSize(400, 200);
        
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        Label lbl = new Label("Hello World! I love Java!");
        lbl.setName("helloWorldLabel");
        lbl.setBounds(80, 80, 250, 30);
        
        frame.add(lbl);
        frame.setVisible(true);
    }
}
