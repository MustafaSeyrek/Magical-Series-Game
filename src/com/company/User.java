package com.company;

public class User {
    private String name;
    private String surname;
    private Date birthdate;
    private String gender;
    private Address contactAddress;
    private Phone phoneNumber;

    public User(String name,String surname, Date birthdate,String gender,Address contactAddress,Phone phoneNumber){
        this.name=name;
        this.surname=surname;
        this.birthdate=birthdate;
        this.gender=gender;
        this.contactAddress=contactAddress;
        this.phoneNumber=phoneNumber;
    }
    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Address getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(Address contactAddress) {
        this.contactAddress = contactAddress;
    }

    public Phone getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Phone phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
