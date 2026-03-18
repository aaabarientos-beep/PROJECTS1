package com.mycompany.menu2;
import java.awt.*;
import java.awt.event.*;
public class Menu2 {

    public static void main(String[] args) {
      Frame frame = new Frame("Menu In A Menu");
        frame.setLayout(null);
        frame.setSize(400, 300);


        Label statusLbl = new Label();
        statusLbl.setName("statusLabel");
        statusLbl.setFont(new Font("Arial", Font.PLAIN, 16));
        statusLbl.setBounds(100, 120, 200, 25);
        statusLbl.setAlignment(Label.CENTER);


        MenuBar menuBar = new MenuBar();
        menuBar.setName("menuBar");
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


        Menu formatMenu = new Menu("Format");
        formatMenu.setName("formatMenu");

        Menu fontColorMenu = new Menu("Font Color");
        fontColorMenu.setName("FontColorMenu");

        MenuItem redItem = new MenuItem("Red");
        redItem.setName("redColorMenuItem");

        MenuItem greenItem = new MenuItem("Green");
        greenItem.setName("greenColorMenuItem");

        MenuItem blueItem = new MenuItem("Blue");
        blueItem.setName("blueColorMenuItem");


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


        redItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                statusLbl.setForeground(Color.RED);
            }
        });

        greenItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                statusLbl.setForeground(Color.GREEN);
            }
        });

        blueItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                statusLbl.setForeground(Color.BLUE);
            }
        });


        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        fontColorMenu.add(redItem);
        fontColorMenu.add(greenItem);
        fontColorMenu.add(blueItem);
        formatMenu.add(fontColorMenu);

        menuBar.add(fileMenu);
        menuBar.add(formatMenu);


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


        frame.add(statusLbl);
        frame.setVisible(true);
    }
}
