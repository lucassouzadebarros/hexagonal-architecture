package com.ntconsult.hotel.adapters.out;

import com.ntconsult.hotel.adapters.out.repository.CustomerRepository;
import com.ntconsult.hotel.adapters.out.repository.entity.CustomerEntity;
import com.ntconsult.hotel.adapters.out.repository.mapper.CustomerEntityMapper;
import com.ntconsult.hotel.application.core.domain.Customer;
import com.ntconsult.hotel.application.ports.out.InsertCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerAdapter implements InsertCustomerOutputPort {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerEntity.getAddress().setId(1L);
        customerRepository.save(customerEntity);

    }
}
