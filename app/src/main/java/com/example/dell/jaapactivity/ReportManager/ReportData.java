package com.example.dell.jaapactivity.ReportManager;

public class ReportData {
    private int id;
    private String mode;
    private long userTime;
    private long actualTime;
    private String date;
    private String time;
    private String day;
    private String type;
    private String audioName;


    public ReportData(){

        //constructor that will be used for jap activity
    }
    public ReportData(String mode,Long userTime,Long actualTime,String date, String time
    ,String day,String type){
        this.mode = mode;
        this.userTime = userTime;
        this.actualTime = actualTime;
        this.date = date;
        this.time = time;
        this.day = day;
        this.type = type;

    }
    //Constructor to be used for meditation activity
    public ReportData(String mode,String date, String time,String day,
                      String audioName,int userTime,int actualTime){

        this.mode = mode;
        this.date = date;
        this.time = time;
        this.day = day;
        this.audioName = audioName;
        this.userTime = userTime;
        this.actualTime = actualTime;

    }

    //Constructor to be used for swadhyay activity
    public ReportData(String mode,String date,String time,String day,int userTime,int actualTime){
        this.mode = mode;
        this.date = date;
        this.time = time;
        this.day = day;
        this.userTime = userTime;
        this.actualTime = actualTime;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public long getUserTime() {
        return userTime;
    }

    public void setUserTime(int userTime) {
        this.userTime = userTime;
    }

    public long getActualTime() {
        return actualTime;
    }

    public void setActualTime(int actualTime) {
        this.actualTime = actualTime;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAudioName() {
        return audioName;
    }

    public void setAudioName(String audioName) {
        this.audioName = audioName;
    }


}
