/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SCDPROJECT;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JTextField;

/**
 *
 * @author Hp 820
 */
public class BookingDAO {

    public int isRoomAvailable(Integer yin, Integer yout, Integer min, Integer mout, Integer din, Integer dout, JTextField grandno, JTextField regularno) {
        try {
            FileInputStream fisc = new FileInputStream("Data.txt");
            ObjectInputStream oisc = new ObjectInputStream(fisc);
            int pgrand = 5;
            int pregular = 5;
            Person cbook;
            while ((cbook = (Person) oisc.readObject()) != null) {

                if (!(cbook.getname().equals(Login.logperson.getname()))) {

                    if (!(cbook.getcoyear() == null)) {

                        Integer y1out = (Integer.parseInt(cbook.getcoyear()));

                        Integer y1in = (Integer.parseInt(cbook.getciyear()));

                        Integer m1in = (Integer.parseInt(cbook.getcimonth()));

                        Integer m1out = (Integer.parseInt(cbook.getcomonth()));

                        Integer d1in = (Integer.parseInt(cbook.getcidate()));

                        Integer d1out = (Integer.parseInt(cbook.getcodate()));

                        if ((!(yin <= y1in && yout <= y1in && min <= m1in && mout <= m1in && din < d1in && dout < d1in)) && (!(yin >= y1out && yout >= y1out && min >= m1out && mout >= m1out && din > d1out && dout > d1out))) {
                            if (Login.logperson.city == cbook.city) {
                                Integer sgrand = (Integer.parseInt(cbook.getgrand()));
                                pgrand = pgrand - sgrand;
                                Integer sregular = (Integer.parseInt(cbook.getregular()));
                                pregular = pregular - sregular;
                            }

                        }

                    }
                }
                if (pgrand < Integer.parseInt(grandno.getText()) || pregular < Integer.parseInt(regularno.getText())) {
                    return 1;
                }

            }

            oisc.close();
            fisc.close();
        } catch (EOFException ez) {
        } catch (ClassNotFoundException ex2) {
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    public void payBill(JTextField regularno, JTextField grandno, JTextField tdatein, JTextField tmonthin, JTextField tyearin, JTextField tdateout, JTextField tmonthout, JTextField tyearout, Integer diffDays) {
        ArrayList<Person> al = new ArrayList();
        try {
            FileInputStream fis = new FileInputStream("Data.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person c;
            while ((c = (Person) ois.readObject()) != null) {

                if (c.getname().equals(Login.logperson.getname())) {
                    c.setrooms(regularno.getText(), grandno.getText());
                    c.city = Login.logperson.city;
                    c.setdates(tdatein.getText(), tmonthin.getText(), tyearin.getText(), tdateout.getText(), tmonthout.getText(), tyearout.getText());
                    c.getsum(Integer.parseInt(regularno.getText()) * diffDays, Integer.parseInt(grandno.getText()) * diffDays);
                    Login.logperson.setdates(tdatein.getText(), tmonthin.getText(), tyearin.getText(), tdateout.getText(), tmonthout.getText(), tyearout.getText());

                    Login.logperson.setrooms(regularno.getText(), grandno.getText());

                }
                al.add(c);
            }
            ois.close();
            fis.close();
        } catch (EOFException e1) {
        } catch (ClassNotFoundException ex2) {
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        saveBill(al);
    }

    public void saveBill(ArrayList<Person> al) {
        try {
            Person c = new Person();
            FileOutputStream fos;
            ObjectOutputStream oos;
            fos = new FileOutputStream("Data.txt");
            oos = new ObjectOutputStream(fos);

            Iterator i1 = al.iterator();
            while (i1.hasNext()) {
                c = (Person) i1.next();
                oos.writeObject(c);

            }

            fos.close();
            oos.close();

        } catch (IOException e3) {
        }
    }
}
