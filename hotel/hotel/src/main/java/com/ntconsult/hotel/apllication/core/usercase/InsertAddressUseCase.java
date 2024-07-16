package com.ntconsult.hotel.apllication.core.usercase;

import com.ntconsult.hotel.apllication.core.domain.Address;
import com.ntconsult.hotel.apllication.ports.in.InsertAddressInputPort;
import com.ntconsult.hotel.apllication.ports.out.InsertAddressOutputPort;

public class InsertAddressUseCase implements InsertAddressInputPort {

    private final InsertAddressOutputPort insertAddressOutputPort;

    public InsertAddressUseCase(InsertAddressOutputPort insertAddressOutputPort){
        this.insertAddressOutputPort = insertAddressOutputPort;
    }

    @Override
    public void inserir(Address address) {
        insertAddressOutputPort.insert(address);
    }
}
