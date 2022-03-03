
package com.covid.dto;

public class Plasma {
    private int pid;
    private String userName;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String bloodGroup;
    private String description;

    public Plasma(String userName, String email, String phone, String address, String city, String bloodGroup, String description) {
        this.userName=userName;
        this.email=email;
        this.phone=phone;
        this.address=address;
        this.city=city;
        this.bloodGroup=bloodGroup;
        this.description=description;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
