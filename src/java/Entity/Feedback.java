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
public class Feedback {
    private int fID;
    private String content;
    private int star;
    private String email;
    private String name;
    private String mobile;
    private String gender;
    private String image;
    private int star_1;

    public Feedback(int fID, String content, int star, String email, String name, String mobile, String gender, String image, int star_1) {
        this.fID = fID;
        this.content = content;
        this.star = star;
        this.email = email;
        this.name = name;
        this.mobile = mobile;
        this.gender = gender;
        this.image = image;
        this.star_1 = star_1;
    }

    public int getfID() {
        return fID;
    }

    public void setfID(int fID) {
        this.fID = fID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getStar_1() {
        return star_1;
    }

    public void setStar_1(int star_1) {
        this.star_1 = star_1;
    }

    @Override
    public String toString() {
        return "Feedback{" + "fID=" + fID + ", content=" + content + ", star=" + star + ", email=" + email + ", name=" + name + ", mobile=" + mobile + ", gender=" + gender + ", image=" + image + ", star_1=" + star_1 + '}';
    }
    
}
