/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Viet
 */
public class Admin {
    public int aID;
    public String username;
    public String password;
    public String name;

    public Admin() {
    }

    public Admin(int aID, String username, String password, String name) {
        this.aID = aID;
        this.username = username;
        this.password = password;
        this.name = name;
    }

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }
    

    public int getaID() {
        return aID;
    }

    public void setaID(int aID) {
        this.aID = aID;
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

    @Override
    public String toString() {
        return "Admin{" + "aID=" + aID + ", username=" + username + ", password=" + password + ", name=" + name + '}';
    }

    
}
