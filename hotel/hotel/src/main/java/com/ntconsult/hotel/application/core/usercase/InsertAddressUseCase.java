package com.ntconsult.hotel.application.core.usercase;

import com.ntconsult.hotel.application.core.domain.Address;
import com.ntconsult.hotel.application.ports.in.InsertAddressInputPort;
import com.ntconsult.hotel.application.ports.out.InsertAddressOutputPort;

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
