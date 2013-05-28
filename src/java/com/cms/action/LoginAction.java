/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cms.action;

import com.opensymphony.xwork2.ModelDriven;
import com.cms.model.*;
import javax.security.auth.message.callback.PrivateKeyCallback;
import javax.servlet.http.HttpSession;
/**
 *
 * @author akash
 */
public class LoginAction implements ModelDriven{

    Login log=new Login();
    
    
    
    @Override
    public Object getModel() {
        return log;
    }
    
    public String doLogin(){
        boolean b=false;
        b=log.logincheck();
        System.out.println("loginaction="+b);
        
        if(b==true)
        return "success";
        else
        return "unsuccess";
        
    }
    
    
}
