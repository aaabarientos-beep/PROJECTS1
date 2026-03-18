package com.mycompany.textfield1;
import java.awt.*;
import java.awt.event.*;
public class TextField1 {

    public static void main(String[] args) {
       Frame frame = new Frame("Text Display");
        frame.setLayout(null);
        frame.setSize(300, 150);
        
        TextField ntxt = new TextField();
        ntxt.setName("nameTextField");
        ntxt.setBounds(50, 30, 100, 25);

        Label lbl = new Label();
        lbl.setName("nameLabel");
        lbl.setBounds(180, 30, 100, 25);
        
        Button dpindot = new Button("Display Text");
        dpindot.setName("displayButton");
        dpindot.setBounds(70, 70, 120, 25);
        dpindot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lbl.setText(ntxt.getText());
            }
        });
        
        frame.addWindowListener(new WindowListener() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
            public void windowOpened(WindowEvent e) {}
            public void windowClosed(WindowEvent e) {}
            public void windowIconified(WindowEvent e) {}
            public void windowDeiconified(WindowEvent e) {}
            public void windowActivated(WindowEvent e) {}
            public void windowDeactivated(WindowEvent e) {}
        });
        
        frame.add(ntxt);
        frame.add(lbl);
        frame.add(dpindot);

        frame.setVisible(true);
    } 
}
