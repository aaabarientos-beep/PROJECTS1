package com.mycompany.skibidi;
import java.awt.*;
import java.awt.event.*;
public class Skibidi extends Frame{

    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setTitle("Panels");
        frame.setSize(600, 500);
        frame.setLocation(500, 250);
        frame.setVisible(true);
        frame.setBounds(10, 20, 560, 460);
        frame.setBackground(Color.BLACK);
        
        Panel mainPanel = new Panel();
        mainPanel.setName("mainPanel");
        mainPanel.setBackground(Color.WHITE);
        mainPanel.setBounds(20, 50, 10, 20);
        frame.add(mainPanel);
        
        
        Panel subPanelA = new Panel();
        subPanelA.setName("subPanelA");
        
        Panel subPanelB = new Panel();
        subPanelB.setName("subPanelB");
        
        mainPanel.add(subPanelB);
        mainPanel.add(subPanelA);
        frame.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
        System.exit(0); 
        }
        });
            }
        }
