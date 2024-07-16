package com.ntconsult.hotel.apllication.ports.in;

import com.ntconsult.hotel.apllication.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdInputPort {

    Optional<Customer> find(Long id);
}
