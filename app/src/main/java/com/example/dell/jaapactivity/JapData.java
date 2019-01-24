package com.example.dell.jaapactivity;

public class JapData {
    int id;
    String type;
    Long time;
    int hasVideo;
    String videoURl;

    public JapData(){

    }
    public JapData(int id, String type, Long time, int hasVideo, String videoURl){
        this.id = id;
        this.type = type;
        this.time = time;
        this.hasVideo = hasVideo;
        this.videoURl = videoURl;

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public int isHasVideo() {
        return hasVideo;
    }

    public void setHasVideo(int hasVideo) {
        this.hasVideo = hasVideo;
    }

    public String getVideoURl() {
        return videoURl;
    }

    public void setVideoURl(String videoURl) {
        this.videoURl = videoURl;
    }



}