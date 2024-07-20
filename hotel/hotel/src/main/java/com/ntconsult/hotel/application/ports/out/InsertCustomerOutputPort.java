package com.ntconsult.hotel.application.ports.out;

import com.ntconsult.hotel.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);
}
