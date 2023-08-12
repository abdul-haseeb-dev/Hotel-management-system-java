/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SCDPROJECT;

/**
 *
 * @author Abdul Haseeb
 */
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Abdul Haseeb
 */
public class Sign_up extends JFrame {

    JPanel p1;
    Container c;
    static public ArrayList<Person> al = new ArrayList();
    private JLabel name, email_id, password;
    private JTextField n, e;
    private JPasswordField p;
    private JButton signup, clear;

    Sign_up() {

        setTitle("Sign up");
        c = getContentPane();
        c.setLayout(new BoxLayout(c, 3));

        p1 = new JPanel();
        p1.setLayout(new GridLayout(6, 2, 10, 10));
        setSize(400, 400);
        setVisible(true);

        name = new JLabel("Name");

        n = new JTextField(40);

        password = new JLabel("Password");

        p = new JPasswordField(8);
        p.setEchoChar('*');

        email_id = new JLabel("Email ID");
        e = new JTextField(20);

        signup = new JButton("Sign up");
        clear = new JButton("Clear all");
        JLabel l1 = new JLabel("");
        JLabel l2 = new JLabel("");

        p1.add(l1);
        p1.add(l2);
        p1.add(name);
        p1.add(n);
        p1.add(password);
        p1.add(p);
        p1.add(email_id);
        p1.add(e);
        p1.add(signup);
        p1.add(clear);

        c.add(p1);

        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ex) {
                n.setText("");
                p.setText("");
                e.setText("");
            }
        });
        signup.addActionListener(new ActionListener() {
            //Code for saving signup details to file
            public void actionPerformed(ActionEvent ex) {
                Controller obj = new Controller();

                try {
                    boolean isPersonAdded = obj.save(n, e, p);
                    if (isPersonAdded) {
                        JOptionPane.showMessageDialog(null, "Welcome to Pindiwal Comfort Hotels " + '\n'
                                + n.getText() + "," + "\nYou have succesfully signed up ", "Message",
                                JOptionPane.INFORMATION_MESSAGE);

                    } else {
                        JOptionPane.showMessageDialog(null, n.getText() + ", Already exists account with that credential!\n ", "Message", JOptionPane.INFORMATION_MESSAGE);

                    }
                } catch (Exception e) {
                }

            }

        });

    }
}
