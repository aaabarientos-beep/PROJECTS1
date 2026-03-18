package com.mycompany.checkboxgroup2;
import java.awt.*;
import java.awt.event.*;
public class CheckboxGroup2 extends Frame {
 public CheckboxGroup2() {
         setTitle("Questionnaire");
        setLayout(null);
        setSize(350, 250);


        Label questionLbl = new Label("Q: Which one is not a primitive datatype?");
        questionLbl.setBounds(50, 30, 280, 25);
        questionLbl.setFont(new Font("Arial", Font.BOLD, 12));

        Checkbox charCb = new Checkbox("char");
        charCb.setName("charCheckBox");
        charCb.setBounds(70, 70, 80, 25);
        charCb.setFont(new Font("Arial", Font.BOLD, 12));

        Checkbox boolCb = new Checkbox("boolean");
        boolCb.setName("booleanCheckBox");
        boolCb.setBounds(70, 100, 80, 25);
        boolCb.setFont(new Font("Arial", Font.BOLD, 12));

        Checkbox intCb = new Checkbox("int");
        intCb.setName("intCheckBox");
        intCb.setBounds(70, 130, 80, 25);
        intCb.setFont(new Font("Arial", Font.BOLD, 12));

        Checkbox stringCb = new Checkbox("String");
        stringCb.setName("stringCheckBox");
        stringCb.setBounds(70, 160, 80, 25);
        stringCb.setFont(new Font("Arial", Font.BOLD, 12));

        CheckboxGroup cbg = new CheckboxGroup();
        charCb.setCheckboxGroup(cbg);
        boolCb.setCheckboxGroup(cbg);
        intCb.setCheckboxGroup(cbg);
        stringCb.setCheckboxGroup(cbg);

        Label resultLbl = new Label();
        resultLbl.setName("resultLabel");
        resultLbl.setBounds(120, 225, 150, 25);
        resultLbl.setFont(new Font("Arial", Font.BOLD, 14));


        Button checkBtn = new Button("Check Answer");
        checkBtn.setName("checkButton");
        checkBtn.setBounds(100, 200, 120, 25);
        checkBtn.setFont(new Font("Arial", Font.BOLD, 12));
        checkBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Checkbox selected = cbg.getSelectedCheckbox();
                if (selected != null && selected.getName().equals("stringCheckBox")) {
                    resultLbl.setText("Correct!");
                } else {
                    resultLbl.setText("Incorrect!");
                }
            }
        });


        addWindowListener(new WindowListener() {
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


        add(questionLbl);
        add(charCb);
        add(boolCb);
        add(intCb);
        add(stringCb);
        add(checkBtn);
        add(resultLbl);

        setVisible(true);
    }
    public static void main(String[] args) {
       CheckboxGroup2 cb=new CheckboxGroup2();
    }
}
