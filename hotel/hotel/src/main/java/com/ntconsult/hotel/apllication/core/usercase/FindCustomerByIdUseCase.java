package com.ntconsult.hotel.apllication.core.usercase;

import com.ntconsult.hotel.apllication.core.domain.Customer;
import com.ntconsult.hotel.apllication.ports.in.FindCustomerByIdInputPort;
import com.ntconsult.hotel.apllication.ports.out.FindCustomerByIdOutputPort;

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
