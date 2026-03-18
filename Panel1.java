package com.mycompany.panel1;
import java.awt.*;
import java.awt.event.*;
public class Panel1 {

    public static void main(String[] args) {
        Frame frame=new Frame("Panels");
        frame.setLayout(null);
        frame.setSize(400, 200);
        
        frame.addWindowListener(new WindowAdapter() {
        public void windowCLosing (WindowEvent e) {
            System.exit(0);
        }
        });
        //Panels
        Panel mP=new Panel();
        mP.setName("mainPanel");
        mP.setLayout(null);
        mP.setBounds(20, 20, 340, 120);
        mP.setBackground(Color.WHITE);
        
        Panel spa=new Panel() {
        @Override
        public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLUE);
        g.drawRect(0, 0, getWidth()-1, getHeight()-1);
        }
        };
        spa.setName("subPanelA");
        spa.setBounds(20, 10, 140, 100);
        spa.setBackground(Color.WHITE);
        
        Panel spb = new Panel() {
             @Override
             public void paint(Graphics g) {
                 super.paint(g);
                 g.setColor(Color.RED);
                 g.drawRect(0, 0, getWidth()-1, getHeight()-1);
             }
         };
         spb.setName("subPanelB");
         spb.setLayout(null);
         spb.setBounds(180, 10, 140, 100); // Pwesto at laki sa mP (katabi ng spa)
         spb.setBackground(Color.WHITE);
         
         // Idagdag ang mga subpanel sa main panel, tapos main panel sa frame
         mP.add(spa);
         mP.add(spb);
         frame.add(mP);
         
         // Ipakitang lahat
         frame.setVisible(true);
}
    }
    
