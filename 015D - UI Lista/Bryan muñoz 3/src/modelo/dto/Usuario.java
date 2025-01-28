/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dto;

/**
 *
 * @author PAAPCA02LC0800
 */
public class Usuario {
    private String user, pass;

    public Usuario() {
    }

    public Usuario(String user, String pass) {
        setUser(user);
        setPass(pass);
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Usuario{" + "user=" + user + ", pass=" + pass + '}';
    }
    
    
}
