
package com.covid.dto;

public class CovidInjection {
    private int cid;
    private String userName;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String injectionName;
    private int price;
    private String type;
    private String description;

    public CovidInjection(String userName, String email, String phone, String address, String city, String type, String injectionName, int price, String description) {
        this.userName = userName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.injectionName = injectionName;
        this.price = price;
        this.type = type;
        this.description = description;
    }

    public CovidInjection(int cid, String userName, String email, String phone, String address, String city, String injectionName, int price, String type, String description) {
        this.cid = cid;
        this.userName = userName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.injectionName = injectionName;
        this.price = price;
        this.type = type;
        this.description = description;
    }

   
    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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

    public String getInjectionName() {
        return injectionName;
    }

    public void setInjectionName(String injectionName) {
        this.injectionName = injectionName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
