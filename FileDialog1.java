package com.mycompany.filedialog1;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class FileDialog1 {

    public static void main(String[] args) {
         Frame frame = new Frame("File Reader");
        frame.setLayout(null);
        frame.setSize(400, 300);


        Label titleLbl = new Label("File Content");
        titleLbl.setFont(new Font("Arial", Font.BOLD, 16));
        titleLbl.setBounds(130, 50, 150, 25);
        titleLbl.setAlignment(Label.CENTER);

        Label contentLbl = new Label();
        contentLbl.setName("fileContentLabel");
        contentLbl.setBounds(130, 90, 150, 25);
        contentLbl.setAlignment(Label.CENTER);

        Button openBtn = new Button("Open");
        openBtn.setName("openFileDialogButton");
        openBtn.setBounds(150, 140, 100, 25);


        openBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FileDialog fd = new FileDialog(frame, "Select File", FileDialog.LOAD);
                fd.setName("fileDialog");
                fd.setVisible(true);

                if (fd.getFile() != null) {
                    String path = fd.getDirectory() + fd.getFile();
                    StringBuilder text = new StringBuilder();
                    try {
                        BufferedReader br = new BufferedReader(new java.io.FileReader(path));
                        String line;
                        while ((line = br.readLine()) != null) {
                            text.append(line);
                        }
                        br.close();
                        contentLbl.setText(text.length() > 0 ? text.toString() : "");
                    } catch (Exception ex) {
                        contentLbl.setText("Error");
                    }
                }
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


        frame.add(titleLbl);
        frame.add(contentLbl);
        frame.add(openBtn);

        frame.setVisible(true);
    }
}
