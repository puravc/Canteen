/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cms.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Purav
 */
public class DbConnection {
    Connection connect;
    ResultSet rs;
    public void dbCon(){
        try{
         Class.forName("com.mysql.jdbc.Driver");
         connect = DriverManager.getConnection("jdbc:mysql://localhost/cms","root","");
            System.out.println("Connection Successfull");
        }catch(Exception e){
            
        }
    }
    public void insert(String q)
    {
        dbCon();
        try {
            Statement st=connect.createStatement();
            st.execute(q);
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ResultSet select(String q)
    {
        dbCon();
        ResultSet rs=null;
        try {
            
            Statement st=connect.createStatement();
            rs=st.executeQuery(q);
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
}
