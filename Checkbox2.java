package com.mycompany.checkbox2;
import java.awt.*;
import java.awt.event.*;
public class Checkbox2 {

    public static void main(String[] args) {
       Frame f = new Frame("Food Kiosk");
        f.setSize(300, 250);
        f.setLayout(null);
        
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


        Label title = new Label("Foods");
        title.setBounds(130, 30, 50, 20);


        Checkbox cb1 = new Checkbox("Pizza");
        cb1.setName("pizzaCheckBox");
        cb1.setBounds(100, 70, 80, 25);


        Checkbox cb2 = new Checkbox("Burger");
        cb2.setName("burgerCheckBox");
        cb2.setBounds(100, 110, 80, 25);


        Checkbox cb3 = new Checkbox("Tea");
        cb3.setName("teaCheckBox");
        cb3.setBounds(100, 150, 80, 25);


        Button b = new Button("Order");
        b.setName("orderButton");
        b.setBounds(100, 190, 80, 25);


        Label l = new Label("0.00");
        l.setName("totalCostLabel");
        l.setBounds(120, 230, 60, 20);


        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double total = 0.0;
                if(cb1.getState()) {
                    total += 100.0;
                }
                if(cb2.getState()) {
                    total += 80.0;
                }
                if(cb3.getState()) {
                    total += 50.0;
                }
                l.setText(String.format("%.2f", total));
            }
        });


        f.add(title);
        f.add(cb1);
        f.add(cb2);
        f.add(cb3);
        f.add(b);
        f.add(l);

        f.setVisible(true); 
    }
}
