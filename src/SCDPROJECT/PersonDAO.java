/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SCDPROJECT;

import static SCDPROJECT.Sign_up.al;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Hp 820
 */
public class PersonDAO {

    public void saveData(JTextField n, JTextField e, JPasswordField p) throws Exception {
        Person p2 = new Person();
        char[] ch = p.getPassword();
        String s = new String(ch);
        p2.signup(n.getText(), e.getText(), s);

        al.add(p2);
        try {
            FileOutputStream fos;
            ObjectOutputStream oos;
            fos = new FileOutputStream("Data.txt");
            oos = new ObjectOutputStream(fos);

            Person c;
            Iterator i = al.iterator();
            while (i.hasNext()) {
                c = (Person) i.next();
                oos.writeObject(c);

            }

            fos.close();
            oos.close();
        } catch (Exception ex) {
        }
    }

    public boolean isPersonExist(JTextField n) {
        int flag = 0;
        try {
            FileInputStream fis = new FileInputStream("Data.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person c;
            while ((c = (Person) ois.readObject()) != null) {
                if (c.getname().equals(n.getText())) {
                    return true;
                }
                al.add(c);
            }
            for (Person a : al) {
                System.out.println(a.getname());
            }
            ois.close();
            fis.close();
            return false;
        } catch (FileNotFoundException e) {
        } catch (EOFException e) {
        } catch (ClassNotFoundException ex2) {
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
