package com.mycompany.button1;
import java.awt.*;
import java.awt.event.*;
public class Button1 {
private int count;
    public static void main(String[] args) {
    Frame frame = new Frame("Counter");
        frame.setSize(300, 200);
        frame.setLayout(null);
        
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


        Label label = new Label("0");
        label.setName("counterLabel");
        label.setFont(new Font("Arial", Font.PLAIN, 24));
        label.setBounds(140, 60, 20, 30);
        frame.add(label);


        Button button = new Button("Click");
        button.setName("incrementButton");
        button.setBounds(110, 110, 80, 30);
        
        class CounterHolder {
            int count = 0;
        }
        CounterHolder holder = new CounterHolder();
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                holder.count++;
                label.setText(String.valueOf(holder.count));
            }
        });
        frame.add(button);


        frame.setVisible(true);
    }
}
