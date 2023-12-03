/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

import java.io.Serializable;

public class Notice implements Serializable {
    
    String noticetopic;  
    String time;
    String date;
    String description;
    
    
    public Notice(String noticetopic,String date,String time,String description) {  
        this.noticetopic=noticetopic;
        this.date = date;
        this.time = time;
        this.description = description;
    }
    
    public void setNoticetopic(String noticetopic) {
        this.noticetopic = noticetopic;
    }
   
    public void setDate(String date) {
        this.date = date;
    }
    
    public void setTime(String time) {
        this.time = time;
    }
    public void setDescription(String description) {
        this.description = description;
    }
     
    public String getNoticetopic() {
        return noticetopic;
    }
    
    public String getDate() {
        return date;
    }
    
    public String getTime() {
        return time;
    }
    
    public String getDescription() {
        return description;
    }
    
    @Override
    public String toString(){
        return "Noticetopic="+noticetopic+",  Date="+date+",Time="+time+", Description="+description;
    }
    
    public void display(){
        System.out.println("Noticetopic="+noticetopic+", Date="+date+",Time="+time+", description="+description);
    }
}

