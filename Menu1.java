package com.mycompany.menu1;
import java.awt.*;
import java.awt.event.*;
public class Menu1 {

    public static void main(String[] args) {
           Frame frame = new Frame("Go To File");
        frame.setLayout(null);
        frame.setSize(400, 300);


        Label statusLbl = new Label();
        statusLbl.setName("statusLabel");
        statusLbl.setFont(new Font("Arial", Font.PLAIN, 16));
        statusLbl.setBounds(100, 120, 200, 25);
        statusLbl.setAlignment(Label.CENTER);


        MenuBar menuBar = new MenuBar();
        frame.setMenuBar(menuBar);

        Menu fileMenu = new Menu("File");
        fileMenu.setName("fileMenu");

        MenuItem newItem = new MenuItem("New");
        newItem.setName("newMenuItem");

        MenuItem openItem = new MenuItem("Open");
        openItem.setName("openMenuItem");

        MenuItem saveItem = new MenuItem("Save");
        saveItem.setName("saveMenuItem");

        MenuItem exitItem = new MenuItem("Exit");
        exitItem.setName("exitMenuItem");


        newItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                statusLbl.setText("Creating new file...");
            }
        });

        openItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                statusLbl.setText("Opening file...");
            }
        });

        saveItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                statusLbl.setText("Saving file...");
            }
        });

        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });


        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);


        frame.add(statusLbl);

        frame.addWindowListener(new WindowListener() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
            public void windowOpened(WindowEvent e) {}
            public void windowClosed(WindowEvent e) {}
            public void windowIconified(WindowEvent e) {}
            public void windowDeiconified(WindowEvent e) {}
            public void windowActivated(WindowEvent e) {}
            public void windowDeactivated(WindowEvent e) {}
        });

        frame.setVisible(true);
    }
}
