package com.ntconsult.hotel.application.ports.in;

import com.ntconsult.hotel.application.core.domain.Customer;

public interface UpdateCustomerInputPort {

    void update(Customer customer, String zipCode);
}
