
package com.covid.dto;

public class Oxygen {
    private int oid;
    private String userName;
    private String email;
    private String phone;
    private String address;
    private String city;
    private int price;
    private String description;

    public Oxygen(String userName, String email, String phone, String address, String city, int price, String description) {
        this.userName=userName;
        this.email=email;
        this.phone=phone;
        this.address=address;
        this.city=city;
        this.price=price;
        this.description=description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
