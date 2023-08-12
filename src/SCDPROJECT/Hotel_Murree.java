/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SCDPROJECT;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class Hotel_Murree extends JFrame {

    private JButton home, roomavail, review, services, contact, login, signup, viewcal, book;

    Hotel_Murree() {
        home = new JButton("Home");
        roomavail = new JButton("View Rooms");
        book = new JButton("Make Booking");
        services = new JButton("Services");
        contact = new JButton("Contact Us");
        setTitle("Hotel");
        setSize(1600, 1000);
        setVisible(true);
        setLayout(new BorderLayout());
        JLabel background = new JLabel(new ImageIcon("background.jpg"));
        add(background);
        JLabel pic = new JLabel(new ImageIcon("Chennai1.0.jpg"));
        pic.setOpaque(false);
        pic.setBounds(375, 0, 1000, 800);
        background.add(pic);
        home.setBounds(10, 170, 250, 30);
        background.add(home);
        home.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        roomavail.setBounds(10, 270, 250, 30);
        background.add(roomavail);
        roomavail.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Room_Murree room2 = new Room_Murree();
                room2.setVisible(true);
            }
        });
        this.setSize(1000, 450);
        this.setVisible(true);

        services.setBounds(10, 370, 250, 30);
        background.add(services);
        services.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Service ser = new Service();
                ser.setVisible(true);
            }
        });
        book.setBounds(10, 570, 250, 30);
        background.add(book);
        book.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(Login.logperson.getcidate()!=null)
                {int i;
                     i = JOptionPane.showConfirmDialog(null,"You have already made a booking ! Making a new booking will cancel the old one ! Do you wish to proceed ?");
                     if(i==0)
                    {bookingpage page = new bookingpage();
                    try {
                        page.book();
                    } catch (AssertionError ex) {
                        Logger.getLogger(Hotel_Murree.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ParseException ex) {
                        Logger.getLogger(Hotel_Murree.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    }
                }
                else
                {bookingpage page = new bookingpage();
                try {
                    page.book();
                } catch (AssertionError ex) {
                    Logger.getLogger(Hotel_Murree.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParseException ex) {
                    Logger.getLogger(Hotel_Murree.class.getName()).log(Level.SEVERE, null, ex);
                }
            }}
        });
        this.setSize(1800, 1450);
        this.setVisible(true);

    }

}
