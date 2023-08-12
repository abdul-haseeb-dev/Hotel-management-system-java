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
    

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */

public class Login extends JFrame{
    public Person c1;
    static Person logperson;
    JPanel p1;
     Container c;
     
    private JLabel name,email_id,password;
    private JTextField n;
    private JPasswordField p;
    private JButton login,Back;
    
    
    
    Login()
    {
        
        setTitle("Log in");
        c=getContentPane();
        c.setLayout(new BoxLayout(c,3));
        
        p1=new JPanel();
        p1.setLayout(new GridLayout(6,2,10,10));
        setSize(400,400);
        setVisible(true);
        
        name=new JLabel("Name");
        
        
        n=new JTextField(40);
        
        
        password=new JLabel("Password");
        
        
        p=new JPasswordField(8);
        p.setEchoChar('*');
        
        
        
        
        login=new JButton("Log in");
        Back=new JButton("Back to Main Page");
        JLabel l1=new JLabel("");
        JLabel l2=new JLabel("");
        
        p1.add(l1);
        p1.add(l2);
        p1.add(name);p1.add(n);
        p1.add(password);p1.add(p);
        
        p1.add(login);p1.add(Back);
       
        c.add(p1);
        
         Back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ex){
            MainPage s = new MainPage();
            s.setVisible(true);
            }});
        login.addActionListener(new ActionListener() 
        {
            //Code for saving log in details to file
            public void actionPerformed(ActionEvent ex)
            {
            int flag1=0;
            
             try 
              {
              FileInputStream fis1 = new FileInputStream("Data.txt");
              ObjectInputStream ois1 = new ObjectInputStream(fis1);
              
              while((c1 = (Person)ois1.readObject()) != null) 
              {
                
                if(c1.getname().equals(n.getText()) && c1.getpassword().equals(new String(p.getPassword())))
                 {flag1=1;
                 logperson=c1;
                  break;
                 }
              }
               ois1.close();
               fis1.close();
              }
            
              catch(EOFException e) {}
              catch(ClassNotFoundException ex2){}
              catch(IOException e) {}
              catch(NullPointerException np){
              }
             
             if(flag1==1)
              {dispose();
                  JOptionPane.showMessageDialog(null, n.getText()+
                      ", you have succesfully logged in ","Message", 
                JOptionPane.INFORMATION_MESSAGE);
               
               Dashboard al=new Dashboard();
              }
             else
             {
                 JOptionPane.showMessageDialog(null, n.getText()+
                         ", Invalid name/password ","Message", 
                 JOptionPane.INFORMATION_MESSAGE);
             }
            }
        });  
}}



