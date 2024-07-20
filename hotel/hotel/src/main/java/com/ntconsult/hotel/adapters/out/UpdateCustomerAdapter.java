package com.ntconsult.hotel.adapters.out;

import com.ntconsult.hotel.adapters.out.repository.CustomerRepository;
import com.ntconsult.hotel.adapters.out.repository.entity.CustomerEntity;
import com.ntconsult.hotel.adapters.out.repository.mapper.CustomerEntityMapper;
import com.ntconsult.hotel.application.core.domain.Customer;
import com.ntconsult.hotel.application.ports.out.UpdateCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateCustomerAdapter implements UpdateCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void update(Customer customer) {

        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);

    }
}
