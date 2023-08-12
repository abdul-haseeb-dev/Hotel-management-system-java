/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SCDPROJECT;
import java.awt.Font;
import javax.swing.*;

/**
 *
 * @author Abdul Haseeb
 */

public class Service extends JFrame{
     
    Service()
    {
    //Adding Background    
    setVisible(true);
    this.setSize(800, 1450);
    JPanel pane = new JPanel();
    pane.setLayout(null);
    JLabel background=new JLabel(new ImageIcon("background1.jpg"));
    background.setBounds(00,00,400,300);
    add(background);
    
    //Adding 3 images 
    JLabel jLabel1= new JLabel(new ImageIcon("food.jpg"));
    JLabel jLabel2= new JLabel(new ImageIcon("laundry.jpg"));
    JLabel jLabel3= new JLabel(new ImageIcon("room.jpg"));
    JLabel jLabel4= new JLabel(new ImageIcon("wifi.jpg"));
    jLabel1.setOpaque(true);
    jLabel1.setBounds(20,0,250,130);
    background.add(jLabel1);
    jLabel2.setOpaque(true);
    jLabel2.setBounds(20,150,250,130);
    background.add(jLabel2);
    jLabel3.setOpaque(true);
    jLabel3.setBounds(20,300,250,130);
    background.add(jLabel3);
    jLabel4.setOpaque(true);
    jLabel4.setBounds(20,450,250,130);
    background.add(jLabel4);
    //Adding Labels
    JLabel jLabel6= new JLabel("FOOD SERVICE",JLabel.CENTER);
    jLabel6.setOpaque(true);
    jLabel6.setBounds(270,0,300,130);
    jLabel6.setFont(new Font("Times New Roman",Font.PLAIN,18));
     background.add(jLabel6);
     
    JLabel jLabel7= new JLabel("LAUNDRY SERVICE",JLabel.CENTER);
    jLabel7.setOpaque(true);
    jLabel7.setBounds(270,150,300,130);
    jLabel7.setFont(new Font("Times New Roman",Font.PLAIN,18));
     background.add(jLabel7);
     
    JLabel jLabel8= new JLabel("ROOM SERVICE",JLabel.CENTER);
    jLabel8.setOpaque(true);
    jLabel8.setBounds(270,300,300,130);
    jLabel8.setFont(new Font("Times New Roman",Font.PLAIN,18));
     background.add(jLabel8);
   
       
    JLabel jLabel9= new JLabel("24/7 FAST WIFI",JLabel.CENTER);
    jLabel9.setOpaque(true);
    jLabel9.setBounds(270,450,300,130);
    jLabel9.setFont(new Font("Times New Roman",Font.PLAIN,18));
     background.add(jLabel9);
    
   
    }
}
    
