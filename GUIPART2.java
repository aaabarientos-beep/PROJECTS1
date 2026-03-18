
package com.mycompany.guipart2;

/**
 *
 * @author abari
 */
import java.awt.*;
import java.awt.event.*;
public class GUIPART2 {
public static void main(String[] args) {
// Create a Frame
Frame frame = new Frame("ActionListener Example");
// Create a Button
Button button = new Button("Click Me!");
// Create a Label to display the result of the button click
Label label = new Label("Button not clicked yet.");
// Create an ActionListener
ActionListener listener = new ActionListener() {
public void actionPerformed(ActionEvent e) {
label.setText("Button clicked!");
}
};
// Register the ActionListener with the Button
button.addActionListener(listener);
// Add components to the Frame
frame.add(button, BorderLayout.CENTER);
frame.add(label, BorderLayout.SOUTH);
// Set Frame properties
frame.setSize(300, 200);
frame.setVisible(true);

frame.addWindowListener(new WindowAdapter()  {
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
     });
}
}