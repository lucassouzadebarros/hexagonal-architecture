package com.ntconsult.hotel.application.ports.in;

import com.ntconsult.hotel.application.core.domain.Address;

public interface InsertAddressInputPort {

    void inserir(Address address);
}
