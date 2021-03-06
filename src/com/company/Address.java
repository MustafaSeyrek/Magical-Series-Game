package com.company;

public class Address {
    private String street;
    private int no;
    private String town;
    private String city;
    private String country;

    public Address(String street, int no, String town, String city, String country) {
        super();
        this.street = street;
        this.no = no;
        this.town = town;
        this.city = city;
        this.country = country;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public String getTown() {
        return town;
    }
    public void setTown(String town) {
        this.town = town;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public String toString() {
        return "Address [street=" + street + ", no=" + no + ", town=" + town + ", city=" + city + ", country=" + country
                + "]";
    }




}
