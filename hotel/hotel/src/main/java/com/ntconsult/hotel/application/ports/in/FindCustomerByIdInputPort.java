package com.ntconsult.hotel.application.ports.in;

import com.ntconsult.hotel.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdInputPort {

    Optional<Customer> find(Long id);
}
