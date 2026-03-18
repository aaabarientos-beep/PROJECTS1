package com.mycompany.dialog1;
import java.awt.*;
import java.awt.event.*;
public class Dialog1 {

    public static void main(String[] args) {
           Frame frame = new Frame("February 29");
        frame.setLayout(null);
        frame.setSize(300, 150);


        TextField yearTf = new TextField();
        yearTf.setName("yearTextField");
        yearTf.setBounds(50, 50, 180, 25);

        Button checkBtn = new Button("Check");
        checkBtn.setName("checkYearButton");
        checkBtn.setBounds(100, 90, 80, 25);


        checkBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int year = Integer.parseInt(yearTf.getText());
                boolean isLeap = false;

                if (year % 4 == 0) {
                    if (year % 100 == 0) {
                        if (year % 400 == 0) {
                            isLeap = true;
                        }
                    } else {
                        isLeap = true;
                    }
                }

                Dialog dialog = new Dialog(frame, "Message", true);
                dialog.setLayout(null);
                dialog.setSize(150, 100);

                Label msgLbl = new Label();
                if (isLeap) {
                    dialog.setName("leapYearDialog");
                    msgLbl.setName("leapYearLabel");
                    msgLbl.setText("Leap year");
                } else {
                    dialog.setName("notLeapYearDialog");
                    msgLbl.setName("notLeapYearLabel");
                    msgLbl.setText("Not a leap year");
                }
                msgLbl.setBounds(30, 30, 100, 25);

                dialog.add(msgLbl);
                dialog.setVisible(true);
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


        frame.add(yearTf);
        frame.add(checkBtn);

        frame.setVisible(true);
    }
}
