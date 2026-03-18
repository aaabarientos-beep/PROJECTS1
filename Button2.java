package com.mycompany.button2;
import java.awt.*;
import java.awt.event.*;
public class Button2 {

    public static void main(String[] args) {
       Frame f = new Frame("Case Switch");
        f.setSize(400, 150);
        f.setLayout(null);
        
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


        Label l = new Label("I love programming!");
        l.setName("textLabel");
        l.setBounds(120, 30, 200, 20);


        Button b1 = new Button("Vowel");
        b1.setName("switchVowelCaseButton");
        b1.setBounds(70, 70, 80, 25);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String txt = l.getText();
                String newTxt = "";
                for(int i=0; i<txt.length(); i++) {
                    char c = txt.charAt(i);
                    if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ||
                       c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                        if(Character.isUpperCase(c)) {
                            newTxt += Character.toLowerCase(c);
                        } else {
                            newTxt += Character.toUpperCase(c);
                        }
                    } else {
                        newTxt += c;
                    }
                }
                l.setText(newTxt);
            }
        });


        Button b2 = new Button("Consonant");
        b2.setName("switchConsonantCaseButton");
        b2.setBounds(160, 70, 80, 25);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String txt = l.getText();
                String newTxt = "";
                for(int i=0; i<txt.length(); i++) {
                    char c = txt.charAt(i);
                    if((c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') &&
                       !(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ||
                         c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
                        if(Character.isUpperCase(c)) {
                            newTxt += Character.toLowerCase(c);
                        } else {
                            newTxt += Character.toUpperCase(c);
                        }
                    } else {
                        newTxt += c;
                    }
                }
                l.setText(newTxt);
            }
        });


        Button b3 = new Button("All");
        b3.setName("switchAllCaseButton");
        b3.setBounds(250, 70, 80, 25);
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String txt = l.getText();
                String newTxt = "";
                for(int i=0; i<txt.length(); i++) {
                    char c = txt.charAt(i);
                    if(Character.isUpperCase(c)) {
                        newTxt += Character.toLowerCase(c);
                    } else if(Character.isLowerCase(c)) {
                        newTxt += Character.toUpperCase(c);
                    } else {
                        newTxt += c;
                    }
                }
                l.setText(newTxt);
            }
        });


        f.add(l);
        f.add(b1);
        f.add(b2);
        f.add(b3);

        f.setVisible(true);
    }
}
