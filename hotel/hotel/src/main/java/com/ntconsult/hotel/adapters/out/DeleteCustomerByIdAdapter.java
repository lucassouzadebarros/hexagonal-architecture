package com.ntconsult.hotel.adapters.out;

import com.ntconsult.hotel.adapters.out.repository.CustomerRepository;
import com.ntconsult.hotel.application.ports.out.DeleteCustomerByIdOutPutPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteCustomerByIdAdapter implements DeleteCustomerByIdOutPutPort {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public void delete(Long id) {
        customerRepository.deleteById(id);
    }
}
