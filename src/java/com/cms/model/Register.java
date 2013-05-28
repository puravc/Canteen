/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cms.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Purav
 */
public class Register {
    String username, password, rpassword, type, name, picture, email, programme, phone;

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

    public String getRpassword() {
        return rpassword;
    }

    public void setRpassword(String rpassword) {
        this.rpassword = rpassword;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProgramme() {
        return programme;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public boolean inesrtRegister()
    {
        boolean result=true;
        try {
            DbConnection con=new DbConnection();
            con.dbCon();
            
            String q1="select username from user";
            ResultSet rs=con.select(q1);
            while(rs.next())
            {
                if(this.username.equalsIgnoreCase(rs.getString("username")))
                {
                    result=false;
                }
            }
            if(result)
            {
                String q2="insert into user(userName,userPassword,userType,userFullName,userEmail,Programme,userPhone) values(" + "'" + username + "','" + password + "','" + type + "','" + name + "','" + email + "','" + programme + "','" + phone + "')";
                con.insert(q2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
}
