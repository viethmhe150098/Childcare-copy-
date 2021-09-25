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
public class Customer {

    private int cID;
    private String first_name;
    private String last_name;
    private String gender;
    private String email;
    private String tel;
    private String username;
    private String password;
    private String age;
    private String status;
    private String address;
    
    public Customer(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Customer(String first_name, String last_name, String gender, String email, String tel, String username, String password, String address) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.email = email;
        this.tel = tel;
        this.username = username;
        this.password = password;
        this.address = address;
    }

    public Customer(String first_name, String last_name, String gender, String email, String tel, String username, String password, String age, String status, String address) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.email = email;
        this.tel = tel;
        this.username = username;
        this.password = password;
        this.age = age;
        this.status = status;
        this.address = address;
    }
       
    
    
    public Customer(int cID, String first_name, String last_name, String gender, String email, String tel, String username, String password, String age, String status, String address) {
        this.cID = cID;
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.email = email;
        this.tel = tel;
        this.username = username;
        this.password = password;
        this.age = age;
        this.status = status;
        this.address = address;
    }
    
    public int getcID() {
        return cID;
    }

    public void setcID(int cID) {
        this.cID = cID;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gendet) {
        this.gender = gendet;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
    

    @Override
    public String toString() {
        return "Customer{" + "cID=" + cID + ", first_name=" + first_name + ", last_name=" + last_name + ", gender=" + gender + ", email=" + email + ", tel=" + tel + ", username=" + username + ", password=" + password + ", age=" + age + ", status=" + status + ", address=" + address + '}';
    }
    
}
