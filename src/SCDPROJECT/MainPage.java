/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SCDPROJECT;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Abdul Haseeb
 */
class MainPage extends JFrame {

    JButton login = new JButton("LOG IN");
    JButton signup = new JButton("SIGN UP");

    JLabel bh1 = new JLabel("Islamabad City");
    JLabel bh2 = new JLabel("Murree City");

    MainPage() {

        JPanel pane = new JPanel();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pane.setLayout(null);

        JLabel p1 = new JLabel(new ImageIcon("islamabad.jpg"));
        JLabel p2 = new JLabel(new ImageIcon("murree.jpg"));

        JLabel background = new JLabel(new ImageIcon("background1.jpg"));
        add(background);
        bh1.setBounds(100, 525, 220, 30);
        
        p1.setBounds(20, 200, 400, 300);
        background.add(p1);
        
        login.setBounds(100, 600, 200, 70);

        background.add(login);
        signup.setBounds(350, 600, 200, 70);
        background.add(signup);

        background.add(bh1);

        bh2.setBounds(550, 525, 220, 30);
        bh1.setFont(new Font("Times New Roman", Font.BOLD, 30));
        bh1.setForeground(Color.BLACK);

        background.add(bh2);
        bh2.setFont(new Font("Times New Roman", Font.BOLD, 30));
        bh2.setForeground(Color.BLACK);

        p2.setBounds(450, 200, 400, 300);
        background.add(p2);


        JLabel label = new JLabel("<html>Pindiwal Comfort Hotels  <br> Now Available in:");
        label.setBounds(150, 30, 500, 100);
        label.setOpaque(false);
        background.add(label);
        label.setFont(new Font("Times New Roman", Font.BOLD, 40));
        label.setForeground(Color.BLACK);

        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Login lp = new Login();
            }
        });

        signup.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Sign_up lp = new Sign_up();
            }
        });

        this.setSize(900, 900);
        this.setVisible(true);
    }

}
