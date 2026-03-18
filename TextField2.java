package com.mycompany.textfield2;
import java.awt.*;
import java.awt.event.*;
public class TextField2 {

    public static void main(String[] args) {
        Frame frame = new Frame("Text Field Enable/Disable");
        frame.setLayout(null);
        frame.setSize(300, 120);
        
        TextField txt = new TextField();
        txt.setName("textField");
        txt.setBounds(50, 30, 200, 25);


        Button eb = new Button("Enable");
        eb.setName("enableButton");
        eb.setBounds(60, 70, 80, 25);
        eb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txt.setEnabled(true);
            }
        });

        Button db = new Button("Disable");
        db.setName("disableButton");
        db.setBounds(150, 70, 80, 25);
        db.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               txt.setEnabled(false);
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


        frame.add(txt);
        frame.add(eb);
        frame.add(db);

        frame.setVisible(true);
    }
}
