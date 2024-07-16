package com.ntconsult.hotel.apllication.ports.in;

import com.ntconsult.hotel.apllication.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);
}
