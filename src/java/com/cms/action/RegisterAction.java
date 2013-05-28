/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cms.action;

import com.cms.model.*;
import com.opensymphony.xwork2.ModelDriven;

/**
 *
 * @author Purav
 */
public class RegisterAction implements ModelDriven{
    Register reg=new Register();
    
    public String doRegister()
    {
        
        boolean result=reg.inesrtRegister();
        if(result)
        {
            return "success";
        }
        else
        {
            return "failure";
        }
    }
    
    
    @Override
    public Object getModel() {
        return reg;
    }
    
}
