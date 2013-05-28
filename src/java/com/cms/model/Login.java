/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cms.model;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author akash
 */
public class Login {
    
    String username, password,type;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public boolean logincheck(){
        DbConnection con=new DbConnection();
        con.dbCon();
        String q="select userName,userPassword,userType from user where userName='"+username+"'and userPassword='"+password+"'and userType='"+type+"'";
        try {
          ResultSet rs=con.select(q);
        if(rs.next())
            return true;
        else
            return false;
          
        } 
        catch (Exception e) {
            return false;
        }
        
     
        
    }
    
    
    
    
}
