package com.beyond.inherit.practice;

public class SmartPhone extends Product {
    private String mobileAgency; // 통신사

    public SmartPhone() {
    }

    public SmartPhone(String code, String name, String brand, int price, String mobileAgency) {
        super(code, name, brand, price);

        this.mobileAgency = mobileAgency;
    }

    public String getMobileAgency() {
        return mobileAgency;
    }

    public void setMobileAgency(String mobileAgency) {
        this.mobileAgency = mobileAgency;
    }

    @Override
    public String information() {
        return String.format("%s, mobileAgency : %s\n", super.information(), mobileAgency);
    }
}
