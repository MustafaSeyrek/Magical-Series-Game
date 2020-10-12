package com.company;

public class Phone {
    private String countryCode;
    private String areaCode;
    private String phoneCode;

    public Phone(String countryCode, String areaCode, String phoneCode) {

        this.countryCode = countryCode;
        this.areaCode = areaCode;
        this.phoneCode = phoneCode;
    }
    public String getCountryCode() {
        return countryCode;
    }
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    public String getAreaCode() {
        return areaCode;
    }
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }
    public String getPhoneCode() {
        return phoneCode;
    }
    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }
    @Override
    public String toString() {
        return "Phone [countryCode=" + countryCode + ", areaCode=" + areaCode + ", phoneCode=" + phoneCode + "]";
    }


}
