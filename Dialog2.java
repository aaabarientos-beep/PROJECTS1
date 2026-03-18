package com.mycompany.dialog2;
import java.awt.*;
import java.awt.event.*;
public class Dialog2 {

    public static void main(String[] args) {
        Frame frame = new Frame("Find the Spy!");
        frame.setLayout(null);
        frame.setSize(550, 100);


        Button btn1 = new Button("2156");
        btn1.setName("button1");
        btn1.setBounds(20, 40, 70, 25);

        Button btn2 = new Button("2265");
        btn2.setName("button2");
        btn2.setBounds(100, 40, 70, 25);

        Button btn3 = new Button("124");
        btn3.setName("button3");
        btn3.setBounds(180, 40, 70, 25);

        Button btn4 = new Button("2014");
        btn4.setName("button4");
        btn4.setBounds(260, 40, 70, 25);

        Button btn5 = new Button("1214");
        btn5.setName("button5");
        btn5.setBounds(340, 40, 70, 25);

        Button btn6 = new Button("562");
        btn6.setName("button6");
        btn6.setBounds(420, 40, 70, 25);

        Button btn7 = new Button("11");
        btn7.setName("button7");
        btn7.setBounds(20, 80, 70, 25);

        Button btn8 = new Button("22");
        btn8.setName("button8");
        btn8.setBounds(100, 80, 70, 25);

        Button btn9 = new Button("213");
        btn9.setName("button9");
        btn9.setBounds(180, 80, 70, 25);

        Button btn10 = new Button("54136");
        btn10.setName("button10");
        btn10.setBounds(260, 80, 70, 25);


        ActionListener spyListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Button clicked = (Button)e.getSource();
                String id = clicked.getLabel();
                int sum = 0;
                int product = 1;

                for (int i = 0; i < id.length(); i++) {
                    int digit = Integer.parseInt(String.valueOf(id.charAt(i)));
                    sum += digit;
                    product *= digit;
                }

                if (sum == product) {
                    Dialog dialog = new Dialog(frame, "Message", true);
                    dialog.setName("noticeDialog");
                    dialog.setLayout(null);
                    dialog.setSize(150, 80);

                    Label msgLbl = new Label("Spy found!");
                    msgLbl.setBounds(30, 20, 100, 25);

                    dialog.add(msgLbl);
                    dialog.setVisible(true);
                }
            }
        };

        btn1.addActionListener(spyListener);
        btn2.addActionListener(spyListener);
        btn3.addActionListener(spyListener);
        btn4.addActionListener(spyListener);
        btn5.addActionListener(spyListener);
        btn6.addActionListener(spyListener);
        btn7.addActionListener(spyListener);
        btn8.addActionListener(spyListener);
        btn9.addActionListener(spyListener);
        btn10.addActionListener(spyListener);


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


        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.add(btn5);
        frame.add(btn6);
        frame.add(btn7);
        frame.add(btn8);
        frame.add(btn9);
        frame.add(btn10);

        frame.setVisible(true);
    }
}
