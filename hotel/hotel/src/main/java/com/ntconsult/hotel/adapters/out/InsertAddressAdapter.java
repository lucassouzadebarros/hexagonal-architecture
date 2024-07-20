package com.ntconsult.hotel.adapters.out;

import com.ntconsult.hotel.adapters.out.repository.AddressRepository;
import com.ntconsult.hotel.adapters.out.repository.mapper.AddressEntityMapper;
import com.ntconsult.hotel.application.core.domain.Address;
import com.ntconsult.hotel.application.ports.out.InsertAddressOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertAddressAdapter implements InsertAddressOutputPort {

    @Autowired
    AddressRepository addressRepository;

    @Autowired
    AddressEntityMapper addressEntityMapper;

    @Override
    public void insert(Address address) {
        var addressEntity = addressEntityMapper.toAddressEntity(address);
        addressRepository.save(addressEntity);
    }
}
