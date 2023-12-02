/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

import java.io.Serializable;


public class Registernewmember implements Serializable {
    private static final long serialVersionUID = 1L;
    protected String name;
    protected String id;
    protected String contact;
    protected String email;
    protected String address;

    public Registernewmember(String name, String id, String contact, String email, String address) {
        this.name = name;
        this.id = id;
        this.contact = contact;
        this.email = email;
        this.address = address;
    }
    
}
