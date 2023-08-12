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
 * @author Abdul Haseeb
 */

public class Hotel_Islamabad extends JFrame {

    private JButton home, roomavail, review, services, contact, login, signup, viewcal, book;

    public void Hotel_Islamabad() {
        home = new JButton("Home");
        roomavail = new JButton("View Rooms");
        book = new JButton("Make Booking");
        services = new JButton("Services");
        setTitle("Hotel");
        this.setSize(1800, 1450);
//        setVisible(true);
        setLayout(new BorderLayout());
        JLabel background = new JLabel(new ImageIcon("background1.jpg"));
        add(background);
        JLabel mumbaipic = new JLabel(new ImageIcon("hotel.jpg"));
        mumbaipic.setOpaque(false);
        mumbaipic.setBounds(375, 0, 1000, 800);
        background.add(mumbaipic);
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
                Room_Islamabad room = new Room_Islamabad();
                room.setVisible(true);
            }
        });
//        this.setSize(1000, 450);
//        this.setVisible(true);

        services.setBounds(10, 370, 250, 30);
        background.add(services);
        services.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Service ser = new Service();
                ser.setVisible(true);
            }
        });
        
        /*
        contact.setBounds(10, 570, 250, 30);
        background.add(contact);
        contact.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contactus cont = new contactus();
                cont.contact();
            }
        });
        */
        book.setBounds(10, 470, 250, 30);
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
                        Logger.getLogger(Hotel_Islamabad.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ParseException ex) {
                        Logger.getLogger(Hotel_Islamabad.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    }
                }
                else{
                bookingpage page = new bookingpage();
                try {
                    page.book();
                } catch (AssertionError ex) {
                    Logger.getLogger(Hotel_Islamabad.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParseException ex) {
                    Logger.getLogger(Hotel_Islamabad.class.getName()).log(Level.SEVERE, null, ex);
                }
               }
            }
        });
        this.setSize(1800, 1450);
        this.setVisible(true);
    }
}
