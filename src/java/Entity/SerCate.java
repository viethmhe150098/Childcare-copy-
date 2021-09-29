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
public class SerCate {
    private String scID;
    private String scCateName;

    public SerCate(String scID, String scCateName) {
        this.scID = scID;
        this.scCateName = scCateName;
    }

    public SerCate() {
    }
    

    public String getScID() {
        return scID;
    }

    public void setScID(String scID) {
        this.scID = scID;
    }

    public String getScCateName() {
        return scCateName;
    }

    public void setScCateName(String scCateName) {
        this.scCateName = scCateName;
    }

    @Override
    public String toString() {
        return "SerCate{" + "scID=" + scID + ", scCateName=" + scCateName + '}';
    }
    
}
