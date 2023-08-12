/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SCDPROJECT;

import java.io.Serializable;

/**
 *
 * @author Abdul Haseeb
 */

public class Person extends AbstractPerson implements Serializable, IPerson  {
    String name;
    String emailid;
    String password;
    String cimonth,ciyear,cidate;
    String comonth,coyear,codate;
    String grand;
    String regular;
    int totalsum;
    public int city;
    Person()
    {
        name=null;
        emailid=null;
        password=null;
        cimonth=null;
        cimonth=ciyear=cidate=null;
        comonth=coyear=codate=null;
        grand="0";
        regular="0";
        totalsum=0;
        city=0;
    }
    public void signup(String name,String emailid, String password) {
        
        this.name=name;
        this.emailid=emailid;
        this.password=password;
        
    }
    void setrooms(String regular,String grand)
    {
        this.regular=regular;
        this.grand=grand;
    }
    void setdates(String cidate,String cimonth,String ciyear,String codate,String comonth,String coyear)
    {
        this.cidate=cidate;
        this.cimonth=cimonth;
        this.ciyear=ciyear;
        this.codate=codate;
        this.comonth=comonth;
        this.coyear=coyear;
    }
    String getname()
    {
        return this.name;
    }
    String getpassword()
    {  
        return this.password;
    }
    String getemail()
    {  
        return this.emailid;
    }
    String getcidate()
    {  
        return this.cidate;
    }
    String getcimonth()
    {  
        return this.cimonth;
    }
    String getciyear()
    {  
        return this.ciyear;
    }
    String getcodate()
    {  
        return this.codate;
    }
    String getcomonth()
    {  
        return this.comonth;
    }
    String getcoyear()
    {  
        return this.coyear;
    }
    
    String getregular(){
        return this.regular;
    }
    
    String getgrand(){
        return this.grand;
    }
     
    public Integer getsum(int regular,int grand){
        totalsum=(int) (regular*2000+grand*10000);
        return(totalsum);
    }
    int getamount()
    {return totalsum;}
    int getcity()
    {
        return city;
    }
   public void display(){
       System.out.println("Name = " + this.name);
       System.out.println("Email = " + this.emailid);
       System.out.println("Password = "+ this.password);
   }
   
   public Person getPerson(){
       return this;
   }
}

