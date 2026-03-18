package com.mycompany.checkboxgroup1;
import java.awt.*;
import java.awt.event.*;
public class CheckboxGroup1 {

    public static void main(String[] args) {
       Frame frame = new Frame("Receipt Generator");
        frame.setLayout(null);
        frame.setSize(450, 400);


        Label nLbl = new Label("Name");
        nLbl.setBounds(50, 30, 60, 25);

        TextField nTf = new TextField();
        nTf.setName("nameTextField");
        nTf.setBounds(120, 30, 150, 25);

        Label pmLbl = new Label("Payment Method");
        pmLbl.setBounds(50, 70, 100, 25);

        Choice pmCh = new Choice();
        pmCh.setName("paymentMethodChoice");
        pmCh.add("Cash");
        pmCh.add("Credit Card");
        pmCh.add("Debit Card");
        pmCh.setBounds(160, 70, 150, 25);

        Label iLbl = new Label("Items");
        iLbl.setBounds(50, 110, 60, 25);

        Label pLbl = new Label("Promos");
        pLbl.setBounds(250, 110, 60, 25);

        Checkbox sCb = new Checkbox("Shoes - 200.00");
        sCb.setName("shoesCheckBox");
        sCb.setBounds(50, 140, 150, 25);

        Checkbox paCb = new Checkbox("Pants - 150.00");
        paCb.setName("pantsCheckBox");
        paCb.setBounds(50, 170, 150, 25);

        Checkbox shCb = new Checkbox("Shirt - 120.00");
        shCb.setName("shirtCheckBox");
        shCb.setBounds(50, 200, 150, 25);

        Checkbox dCb = new Checkbox("Default");
        dCb.setName("defaultCheckBox");
        dCb.setBounds(250, 140, 100, 25);

        Checkbox spCb = new Checkbox("Special");
        spCb.setName("specialCheckBox");
        spCb.setBounds(250, 170, 100, 25);

        CheckboxGroup promoGroup = new CheckboxGroup();
        dCb.setCheckboxGroup(promoGroup);
        spCb.setCheckboxGroup(promoGroup);

        TextArea rTa = new TextArea();
        rTa.setName("receiptTextArea");
        rTa.setBounds(50, 270, 350, 80);


        Button gBtn = new Button("Generate Receipt");
        gBtn.setName("generateButton");
        gBtn.setBounds(150, 230, 120, 25);
        gBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nTf.getText();
                String payM = pmCh.getSelectedItem();
                String items = "";
                double total = 0.0;

                if (sCb.getState()) {
                    items += "Shoes";
                    total += 200.00;
                }
                if (paCb.getState()) {
                    if (!items.isEmpty()) items += ", ";
                    items += "Pants";
                    total += 150.00;
                }
                if (shCb.getState()) {
                    if (!items.isEmpty()) items += ", ";
                    items += "Shirt";
                    total += 120.00;
                }

                if (spCb.getState()) {
                    total = total * 0.85;
                } else if (dCb.getState() && total > 300.00) {
                    total = total * 0.95;
                }

                String receipt = "Name: " + name + "\n"
                               + "Items: " + items + "\n"
                               + "Payment Method: " + payM + "\n"
                               + "Total Cost: " + String.format("%.2f", total);

                rTa.setText(receipt);
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


        frame.add(nLbl);
        frame.add(nTf);
        frame.add(pmLbl);
        frame.add(pmCh);
        frame.add(iLbl);
        frame.add(pLbl);
        frame.add(sCb);
        frame.add(paCb);
        frame.add(shCb);
        frame.add(dCb);
        frame.add(spCb);
        frame.add(rTa);
        frame.add(gBtn);

        frame.setVisible(true);
    }
}
