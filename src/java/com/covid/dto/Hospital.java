
package com.covid.dto;

public class Hospital {
    private int hid;
    private String hospitalName;
    private String phone;
    private String address;
    private String city;
    private String covid;
    private String vaccinationCenter;
    private String description;

    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
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

    public String getCovid() {
        return covid;
    }

    public void setCovid(String covid) {
        this.covid = covid;
    }

    public String getVaccinationCenter() {
        return vaccinationCenter;
    }

    public void setVaccinationCenter(String vaccinationCenter) {
        this.vaccinationCenter = vaccinationCenter;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
