package com.ntconsult.hotel.apllication.ports.out;

import com.ntconsult.hotel.apllication.core.domain.Address;

public interface FindAdressBbyZipCodeOutputPort {

    Address find(String zipCode);
}
