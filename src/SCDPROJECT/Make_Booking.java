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

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JFrame;

/**
 *
 * @author admin
 */
public class Make_Booking extends JFrame {

    JButton bh1 = new JButton("Islamabad");
    JButton bh2 = new JButton("Murree");
    private ButtonHandler listener = new ButtonHandler();

    Make_Booking() {

        JPanel pane = new JPanel();
        pane.setLayout(null);

        JLabel p1 = new JLabel(new ImageIcon("islamabad.jpg"));
        JLabel p2 = new JLabel(new ImageIcon("murree.jpg"));
        JLabel background = new JLabel(new ImageIcon("background1.jpg"));
        add(background);
        bh1.setBounds(100, 525, 220, 30);

        p1.setBounds(20, 200, 400, 300);
        background.add(p1);

        bh1.addActionListener((ActionListener) listener);
        background.add(bh1);

        bh2.setBounds(550, 525, 220, 30);

        background.add(bh2);
        bh2.addActionListener(listener);
        p2.setBounds(450, 200, 400, 300);
        background.add(p2);

        
        JLabel label1 = new JLabel("Select city ", JLabel.CENTER);
        label1.setOpaque(false);
        label1.setBounds(460, 610, 400, 50);
        background.add(label1);
        label1.setFont(new Font("Times New Roman", Font.BOLD, 30));
        label1.setForeground(Color.BLACK);

        JLabel label = new JLabel("Pindiwal Comfort Hotels", JLabel.CENTER);
        label.setBounds(420, 30, 500, 100);
        label.setOpaque(false);
        background.add(label);
        label.setFont(new Font("Times New Roman", Font.BOLD, 30));
        label.setForeground(Color.BLACK);
        this.setSize(1800, 1450);
        this.setVisible(true);
    }

    private class ButtonHandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            {
                if (e.getSource() == bh1) {
                    Login.logperson.city = 1;
                    Hotel_Islamabad p = new Hotel_Islamabad();
                    p.setVisible(true);

                } else if (e.getSource() == bh2) {
                    Login.logperson.city = 2;
                    Hotel_Murree p2 = new Hotel_Murree();
                    p2.setVisible(true);
                }
            }
        }
    }
}
