package guipart;
import java.awt.*;
import java.awt.event.*;

public class GUIPART extends Frame {

    public static void main(String[] args) {

     GUIPART frame= new GUIPART();   
     frame.setTitle("My AWT Frame");
     frame.setSize(800, 500);
     frame.setVisible(true);
     frame.setBackground(Color.RED);
     frame.setForeground(Color.BLACK);
     frame.setFont(new Font ("Arial", Font.PLAIN, 14));
     frame.setLayout(null);
     
     //Create Panel
     Panel panell=new Panel();
     panell.setBounds(20, 50, 400, 380); // pinalaki height
     panell.setBackground(Color.PINK);
     panell.setLayout(null);
     
     Panel panel2=new Panel();
     panel2.setBounds(450, 50, 400, 380);
     panel2.setBackground(Color.BLUE);
     panel2.setLayout(null);

     // Create Label
     Label lab=new Label("WAG NA MAGPASA");
     lab.setBounds(20, 10, 200, 25); // wider para makita text
     lab.setFont(new Font("Arial", Font.BOLD, 12));
     lab.setAlignment(Label.LEFT);

     //Create buttons
     Button bb=new Button("OK");
     bb.setBounds(20, 45, 100, 30);

     Button bbc=new Button("Cancel");
     bbc.setBounds(140, 45, 100, 30);

     //Create checkbox
     Checkbox cb=new Checkbox("System");
     cb.setBounds(20, 85, 120, 25);

     //Create Text Field
     TextField tf=new TextField(20);
     tf.setBounds(20, 120, 200, 30);

     //Create Text Area
     TextArea ta=new TextArea();
     ta.setBounds(20, 160, 200, 60);

     //Create choice control
     Choice cc=new Choice();
     cc.setBounds(240, 120, 120, 30);
     cc.add("1");
     cc.add("2");
     cc.add("3");
     cc.add("4");
     cc.add("5");

     //create Checkbox group
     CheckboxGroup cbg=new CheckboxGroup();
     Checkbox cb1=new Checkbox("Male", cbg, false);
     Checkbox cb2=new Checkbox("Female", cbg, true);

     cb1.setBounds(240, 160, 100, 25);
     cb2.setBounds(240, 190, 100, 25);
     
     //Scrollbar
      Scrollbar sb=new Scrollbar(Scrollbar.VERTICAL, 0, 1, 0, 100);
        sb.setBounds(850, 50, 20, 600);
        
//Dialogue

     //create list control
     List l=new List();
     l.add("Banana");
     l.add("Apple");
     l.add("Mango");
     l.setBounds(20, 230, 200, 100);

     // add to panel ONLY
     panell.add(lab);
     panell.add(bb);
     panell.add(bbc);
     panell.add(cb);
     panell.add(tf);
     panell.add(ta);
     panell.add(cc);
     panell.add(cb1);
     panell.add(cb2);
     panell.add(l);
     panell.add(sb);
     frame.add(panell);
     frame.add(panel2);
     frame.add(sb);
     frame.addWindowListener(new WindowAdapter()  {
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
     });
    }
}