package com.ntconsult.hotel.application.ports.in;

import com.ntconsult.hotel.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);
}
