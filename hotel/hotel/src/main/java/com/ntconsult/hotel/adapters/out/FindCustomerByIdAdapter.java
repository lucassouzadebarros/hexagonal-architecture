package com.ntconsult.hotel.adapters.out;

import com.ntconsult.hotel.adapters.out.repository.CustomerRepository;
import com.ntconsult.hotel.adapters.out.repository.entity.CustomerEntity;
import com.ntconsult.hotel.adapters.out.repository.mapper.CustomerEntityMapper;
import com.ntconsult.hotel.apllication.core.domain.Customer;
import com.ntconsult.hotel.apllication.ports.out.FindCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindCustomerByIdAdapter implements FindCustomerByIdOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> find(Long id) {

        var customerEntity = customerRepository.findById(id);
        return customerEntity.map(entity -> customerEntityMapper.toCustomer(entity));
    }
}
