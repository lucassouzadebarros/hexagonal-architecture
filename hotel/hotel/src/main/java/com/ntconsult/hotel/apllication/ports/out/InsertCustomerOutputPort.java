package com.ntconsult.hotel.apllication.ports.out;

import com.ntconsult.hotel.apllication.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);
}
