package com.mycompany.checkbox1;
import java.awt.*;
import java.awt.event.*;
public class Checkbox1 {

    public static void main(String[] args) {
         Frame f = new Frame("Checkboxes");
        f.setSize(300, 220);
        f.setLayout(null);
        
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


        Checkbox cb1 = new Checkbox("First");
        cb1.setName("firstCheckBox");
        cb1.setBounds(50, 40, 80, 25);


        Checkbox cb2 = new Checkbox("Second");
        cb2.setName("secondCheckBox");
        cb2.setBounds(50, 80, 80, 25);


        Checkbox cb3 = new Checkbox("Third");
        cb3.setName("thirdCheckBox");
        cb3.setBounds(50, 120, 80, 25);


        Button b = new Button("Display");
        b.setName("displaySelectedButton");
        b.setBounds(90, 160, 80, 25);


        Label l = new Label("");
        l.setName("checkBoxesLabel");
        l.setBounds(50, 200, 200, 20);


        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selected = "";
                if(cb1.getState()) {
                    selected += "First";
                }
                if(cb2.getState()) {
                    if(!selected.isEmpty()) {
                        selected += ", ";
                    }
                    selected += "Second";
                }
                if(cb3.getState()) {
                    if(!selected.isEmpty()) {
                        selected += ", ";
                    }
                    selected += "Third";
                }
                l.setText(selected);
            }
        });


        f.add(cb1);
        f.add(cb2);
        f.add(cb3);
        f.add(b);
        f.add(l);

        f.setVisible(true);
    }
}
