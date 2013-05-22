/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.purav.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sun.xml.rpc.processor.modeler.j2ee.xml.string;
import com.purav.model.*;
/**
 *
 * @author Purav
 */
public class SaveForm extends ActionSupport implements ModelDriven{
    Form f=new Form();
    String value;
    public SaveForm() {
    }
    
    public String execute() throws Exception {
        
        if(f.verify())
        {
            value="success";
            System.out.println(value);
            return "success";
        }
        else
        {   
            value="faile";
            return "failure";
            
        }
    }

    @Override
    public Object getModel() {
        return f;
    }
}