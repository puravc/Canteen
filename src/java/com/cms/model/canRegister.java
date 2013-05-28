/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cms.model;

import java.sql.ResultSet;

/**
 *
 * @author akash
 */
public class canRegister {
    String username,password,name,email,phone,rpassword;

    public String getRpassword() {
        return rpassword;
    }

    public void setRpassword(String rpassword) {
        this.rpassword = rpassword;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public boolean cRegister(){
        DbConnection db=new DbConnection();
        db.dbCon();
        String dub="select * from canteen where username='"+username+"'";
        ResultSet rs=db.select(dub);
        try {
            if(rs.next())
        {         
        String st="insert into canteen (cUsername,cPassword,cName,cEmail,cPhone) values('"+username+"','"+password+"','"+name+"','"+email+"','"+phone+"')";
        db.insert(st);
        return true;
        }
        else
        return false;
        
        } catch (Exception e) {
            return false;
        }
        
        
    }
    
}
