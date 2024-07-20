package com.ntconsult.hotel.application.core.domain;

public class Address {

    public Address(){

    }

    public Address(String street, String city, String state, Long id) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.id = id;
    }

    private Long id;

    private String street;

    private String city;

    private String state;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
