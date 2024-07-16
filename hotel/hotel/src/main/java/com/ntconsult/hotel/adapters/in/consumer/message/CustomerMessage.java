package com.ntconsult.hotel.adapters.in.consumer.message;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerMessage {

    private String id;
    private String name;
    private String zipCode;
    private String isValidCpf;
    private String cpf;

    public CustomerMessage() {
        // Construtor sem argumentos necessário para Jackson
    }

    @JsonCreator
    public CustomerMessage(
            @JsonProperty("id") String id,
            @JsonProperty("name") String name,
            @JsonProperty("zipCode") String zipCode,
            @JsonProperty("isValidCpf") String isValidCpf,
            @JsonProperty("cpf") String cpf) {
        this.id = id;
        this.name = name;
        this.zipCode = zipCode;
        this.isValidCpf = isValidCpf;
        this.cpf = cpf;
    }

    // Getters e setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getIsValidCpf() {
        return isValidCpf;
    }

    public void setIsValidCpf(String isValidCpf) {
        this.isValidCpf = isValidCpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
