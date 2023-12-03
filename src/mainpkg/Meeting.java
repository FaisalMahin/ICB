/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author Administrator
 */
public class Meeting {
    String meetingId;
    String purpose;  
    String time;
    String datePicker;
    String appoval;

    public Meeting(String meetingId, String purpose, String time, String datePicker, String appoval) {
        this.meetingId = meetingId;
        this.purpose = purpose;
        this.time = time;
        this.datePicker = datePicker;
        this.appoval = appoval;
    }

    public String getMeetingId() {
        return meetingId;
    }

    public String getPurpose() {
        return purpose;
    }

    public String getTime() {
        return time;
    }

    public String getDate() {
        return datePicker;
    }

    public String getAppoval() {
        return appoval;
    }

    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setDate(String date) {
        this.datePicker = date;
    }

    public void setAppoval(String appoval) {
        this.appoval = appoval;
    }

    @Override
    public String toString() {
        return "Meeting{" + "meetingId=" + meetingId + ", purpose=" + purpose + ", time=" + time + ", date=" + datePicker + ", appoval=" + appoval + '}';
    }
    public void display(){
        System.out.println("Meeting ID="+meetingId+",Purpose="+purpose+", Time="+time+", Date="+datePicker+", Appoval="+appoval);
    }
}
