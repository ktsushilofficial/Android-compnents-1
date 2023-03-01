package com.example.maxcomponent.Models;

public class MessageModel {
    String name,time,lastmessage,phone,country;
    int img;

    public MessageModel(String name, String time, String lastmessage, String phone, String country, int img) {
        this.name = name;
        this.time = time;
        this.lastmessage = lastmessage;
        this.phone = phone;
        this.country = country;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLastmessage() {
        return lastmessage;
    }

    public void setLastmessage(String lastmessage) {
        this.lastmessage = lastmessage;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
