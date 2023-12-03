/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

import java.io.Serializable;


public class Registernewmember implements Serializable {
    private static final long serialVersionUID = 1L;
    protected String fname;
    protected String lname;
    protected String acctype;
    protected String contact;
    protected String email;
    protected String nid;

    public Registernewmember(String fname, String lname,String acctype, String contact, String email, String nid) {
        this.fname = fname;
        this.lname = lname;
        this.acctype = acctype;
        this.contact = contact;
        this.email = email;
        this.nid = nid;
        
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getAcctype() {
        return acctype;
    }

    public String getContact() {
        return contact;
    }

    public String getEmail() {
        return email;
    }

    public String getNid() {
        return nid;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setAcctype(String acctype) {
        this.acctype = acctype;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    @Override
    public String toString() {
        return "Registernewmember{" + "fname=" + fname + ", lname=" + lname + ", acctype=" + acctype + ", contact=" + contact + ", email=" + email + ", nid=" + nid + '}';
    }
    
}
