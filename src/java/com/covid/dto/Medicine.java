
package com.covid.dto;

public class Medicine {
    private int mid;
    private String userName;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String medicineName;
    private String type;
    private int price;
    private String description;

    public Medicine(String userName, String email, String phone, String address, String city, String type, String medicineName, int price, String description) {
        this.userName=userName;
        this.email=email;
        this.phone=phone;
        this.address=address;
        this.city=city;
        this.type=type;
        this.medicineName=medicineName;
        this.price=price;
        this.description=description;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
