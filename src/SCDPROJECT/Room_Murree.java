/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SCDPROJECT;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author User
 */
public class Room_Murree extends JFrame {

    Room_Murree() {
        //Adding Background    
        setVisible(true);
        this.setSize(1800, 1450);
        JPanel pane = new JPanel();
        pane.setLayout(null);
        JLabel background = new JLabel(new ImageIcon("background1.jpg"));
        background.setBounds(00, 00, 400, 300);
        add(background);

        //Adding 3 images 
        JLabel jLabel1 = new JLabel(new ImageIcon("simple2.jpg"));
        JLabel jLabel2 = new JLabel(new ImageIcon("luxury2.jpg"));
        jLabel1.setOpaque(true);
        jLabel1.setBounds(360, 0, 800, 200);
        background.add(jLabel1);
        jLabel2.setOpaque(true);
        jLabel2.setBounds(360, 220, 800, 200);
        background.add(jLabel2);

        //Adding Room Labels
        JLabel jLabel4 = new JLabel("Simple Room", JLabel.CENTER);
        jLabel4.setOpaque(true);
        jLabel4.setBounds(10, 0, 345, 30);
        jLabel4.setFont(new Font("Castellar", Font.PLAIN, 18));
        background.add(jLabel4);

        JLabel jLabel5 = new JLabel("Luxury Room", JLabel.CENTER);
        jLabel5.setOpaque(true);
        jLabel5.setBounds(10, 220, 345, 30);
        jLabel5.setFont(new Font("Castellar", Font.PLAIN, 18));
        background.add(jLabel5);


        //Adding Description
        JTextArea jTextArea1 = new JTextArea("  The Simple Room contains: \n"
                + "  bed, sofa, table and AC.\n"
                + "  You can call us at any time. \n"
                + "  RATE:Rs.2,000/day");
        jTextArea1.setOpaque(true);
        jTextArea1.setBounds(10, 30, 345, 170);
        jTextArea1.setEditable(false);
        jTextArea1.setFont(new Font("Aparajita", Font.PLAIN, 24));
        background.add(jTextArea1);
        JTextArea jTextArea2 = new JTextArea("  The Luxury Room contains: \n"
                + "  Bed, Sofa, TV and snowview\n"
                + "  Including one time lunch.  \n"
                + "  Here very kind of facilities.\n   RATE:Rs.10,000/day");
        jTextArea2.setOpaque(true);
        jTextArea2.setBounds(10, 250, 345, 170);
        jTextArea2.setEditable(false);
        jTextArea2.setFont(new Font("Aparajita", Font.PLAIN, 24));
        background.add(jTextArea2);

    }

}
