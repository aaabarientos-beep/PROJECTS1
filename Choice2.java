package com.mycompany.choice2;
import java.awt.*;
import java.awt.event.*;
public class Choice2 {

    public static void main(String[] args) {
      Frame frame = new Frame("Simple Calculator");
        frame.setLayout(null);
        frame.setSize(380, 160);


        Label num1lbl = new Label("Number 1");
        num1lbl.setBounds(60, 40, 60, 25);

        TextField num1tf = new TextField();
        num1tf.setName("num1TextField");
        num1tf.setBounds(60, 65, 80, 25);

        Choice opc = new Choice();
        opc.setName("operationsChoice");
        opc.add("+");
        opc.add("-");
        opc.add("*");
        opc.add("/");
        opc.setBounds(150, 65, 40, 25);
        opc.setBackground(Color.BLUE);
        opc.setForeground(Color.WHITE);


        Label num2lbl = new Label("Number 2");
        num2lbl.setBounds(200, 40, 60, 25);

        TextField num2tf = new TextField();
        num2tf.setName("num2TextField");
        num2tf.setBounds(200, 65, 80, 25);

        Label rlblt = new Label("Result");
        rlblt.setBounds(300, 40, 60, 25);

        Label rlbl = new Label();
        rlbl.setName("resultLabel");
        rlbl.setBounds(300, 65, 80, 25);


        Button cbut = new Button("Compute Result");
        cbut.setName("computeButton");
        cbut.setBounds(120, 100, 120, 25);
        cbut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    int num1 = Integer.parseInt(num1tf.getText());
                    int num2 = Integer.parseInt(num2tf.getText());
                    int result = 0;
                    String selected = opc.getSelectedItem();

                    if (selected.equals("+")) {
                        result = num1 + num2;
                    } else if (selected.equals("-")) {
                        result = num1 - num2;
                    } else if (selected.equals("*")) {
                        result = num1 * num2;
                    } else if (selected.equals("/")) {
                        result = (num2 != 0) ? num1 / num2 : 0;
                    }

                    rlbl.setText(String.valueOf(result));
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


        frame.add(num1lbl);
        frame.add(num1tf);
        frame.add(opc);
        frame.add(num2lbl);
        frame.add(num2tf);
        frame.add(rlblt);
        frame.add(rlbl);
        frame.add(cbut);

        frame.setVisible(true);
    }
}
