/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SCDPROJECT;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Hp 820
 */
public class Controller {

    PersonDAO pDao;
    BookingDAO bDao;
    public Controller() {
        pDao = new PersonDAO();
        bDao = new BookingDAO();
    }

    public boolean save(JTextField n, JTextField e, JPasswordField p) throws Exception {
        boolean isExist = pDao.isPersonExist(n);
        if (!isExist) {
            try {
                pDao.saveData(n, e, p);
                return true;
            } catch (Exception ex) {
                return false;
            }
        } else{
            return false;
        }
    }
    
    public int isRoomAvailable(Integer yin, Integer yout, Integer min, Integer mout, Integer din, Integer dout, JTextField grandno, JTextField regularno){
      int flag =   bDao.isRoomAvailable(yin, yout, min, mout, din, dout, grandno, regularno);
      return flag;
    }
    
    public void payBill(JTextField regularno, JTextField grandno, JTextField tdatein, JTextField tmonthin, JTextField tyearin, JTextField tdateout, JTextField tmonthout, JTextField tyearout, Integer diffDays){
        bDao.payBill(regularno, grandno, tdatein, tmonthin, tyearin, tdateout, tmonthout, tyearout, diffDays);
    }
}
