package com.ntconsult.hotel.application.core.domain;

public class Customer {

    public Customer(){
        this.isValidCpf = false;
    }

    public Customer(Long id, String name, com.ntconsult.hotel.application.core.domain.Address address, String cpf, boolean isValidCpf) {
        this.id = id;
        this.name = name;
        Address = address;
        this.cpf = cpf;
        this.isValidCpf = isValidCpf;
    }

    private Long id;

    private String name;

    private Address Address;

    private String cpf;

    private boolean isValidCpf;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public com.ntconsult.hotel.application.core.domain.Address getAddress() {
        return Address;
    }

    public void setAddress(Address address) {
        Address = address;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isValidCpf() {
        return isValidCpf;
    }

    public void setValidCpf(boolean validCpf) {
        isValidCpf = validCpf;
    }
}
