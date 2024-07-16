package com.ntconsult.hotel.apllication.ports.in;

import com.ntconsult.hotel.apllication.core.domain.Customer;

public interface UpdateCustomerInputPort {

    void update(Customer customer, String zipCode);
}
