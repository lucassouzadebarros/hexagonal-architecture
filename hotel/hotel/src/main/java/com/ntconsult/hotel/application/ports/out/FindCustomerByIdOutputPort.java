package com.ntconsult.hotel.application.ports.out;

import com.ntconsult.hotel.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {

    Optional<Customer> find(Long id);
}
