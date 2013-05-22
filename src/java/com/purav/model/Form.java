/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.purav.model;

import antlr.StringUtils;

/**
 *
 * @author Purav
 */
public class Form {
    String username,email,password;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
    public boolean verify()
    {
        if(username.equalsIgnoreCase(password))
        {
            return true;
        }
        else
            return false;
    }
}
