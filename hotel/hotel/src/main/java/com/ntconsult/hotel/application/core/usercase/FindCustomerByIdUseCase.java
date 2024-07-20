package com.ntconsult.hotel.application.core.usercase;

import com.ntconsult.hotel.application.core.domain.Customer;
import com.ntconsult.hotel.application.ports.in.FindCustomerByIdInputPort;
import com.ntconsult.hotel.application.ports.out.FindCustomerByIdOutputPort;

import java.util.Optional;

public class FindCustomerByIdUseCase implements FindCustomerByIdInputPort {

    private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    public FindCustomerByIdUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
    }

    @Override
    public Optional<Customer> find(Long id){
        return Optional.ofNullable(findCustomerByIdOutputPort.find(id)
                .orElseThrow(() -> new RuntimeException("Customer not found")));
    }
}
