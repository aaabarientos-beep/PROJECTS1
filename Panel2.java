package com.mycompany.panel2;
import java.awt.*;
import java.awt.event.*;
public class Panel2 {

    public static void main(String[] args) {
        Frame frame = new Frame("Panels with Position");
        frame.setLayout(null);
        frame.setSize(450, 300);
        
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        Panel mP = new Panel() {
            @Override
            public void paint(Graphics g) {
                super.paint(g);
                g.setColor(Color.BLACK);
                g.drawRect(0, 0, getWidth()-1, getHeight()-1);
            }
        };
        mP.setName("mainPanel");
        mP.setLayout(null);
        mP.setBounds(20, 20, 390, 220);
        mP.setBackground(Color.WHITE);
        
        Panel spa = new Panel();
        spa.setName("subPanelA");
        spa.setLayout(null);
        spa.setBounds(10, 10, 100, 80);
        spa.setBackground(Color.WHITE);
        
        Panel spb = new Panel();
        spb.setName("subPanelB");
        spb.setLayout(null);
        spb.setBounds(200, 90, 100, 80);
        spb.setBackground(Color.WHITE);
        
        mP.add(spa);
        mP.add(spb);
        frame.add(mP);
        
        frame.setVisible(true);
    }
}
