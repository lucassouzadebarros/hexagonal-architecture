package com.ntconsult.hotel.apllication.ports.out;

import com.ntconsult.hotel.apllication.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {

    Optional<Customer> find(Long id);
}
