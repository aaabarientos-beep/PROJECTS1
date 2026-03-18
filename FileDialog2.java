package com.mycompany.filedialog2;
import java.awt.*;
import java.awt.event.*;
public class FileDialog2 {

    public static void main(String[] args) {
        Frame frame = new Frame("File Saver");
        frame.setLayout(null);
        frame.setSize(350, 200);


        Label titleLbl = new Label("Content of the created file");
        titleLbl.setFont(new Font("Arial", Font.BOLD, 14));
        titleLbl.setBounds(80, 40, 200, 25);

        Label contentLbl = new Label();
        contentLbl.setName("fileContentLabel");
        contentLbl.setBounds(130, 80, 100, 25);

        Button createBtn = new Button("Create File");
        createBtn.setName("createFileButton");
        createBtn.setBounds(120, 120, 100, 25);


        createBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FileDialog fd = new FileDialog(frame, "Save File", FileDialog.SAVE);
                fd.setName("fileDialog");
                fd.setVisible(true);

                if (fd.getFile() != null) {
                    String path = fd.getDirectory() + fd.getFile();
                    String content = "File handling";

                    try {
                        java.io.FileWriter fw = new java.io.FileWriter(path);
                        fw.write(content);
                        fw.close();
                        contentLbl.setText(content);
                    } catch (Exception ex) {
                        contentLbl.setText("Error creating file");
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
        frame.add(createBtn);

        frame.setVisible(true);
    }
}
