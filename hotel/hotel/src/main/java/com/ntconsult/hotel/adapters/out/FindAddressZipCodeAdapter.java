package com.ntconsult.hotel.adapters.out;

import com.ntconsult.hotel.adapters.out.client.FindAddressByZipCodeClient;
import com.ntconsult.hotel.adapters.out.client.mapper.AddressResponseMapper;
import com.ntconsult.hotel.apllication.core.domain.Address;
import com.ntconsult.hotel.apllication.ports.out.FindAdressBbyZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressZipCodeAdapter implements FindAdressBbyZipCodeOutputPort {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}
