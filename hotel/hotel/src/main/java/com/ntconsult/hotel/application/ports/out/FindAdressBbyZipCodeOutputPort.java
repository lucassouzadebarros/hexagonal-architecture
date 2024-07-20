package com.ntconsult.hotel.application.ports.out;

import com.ntconsult.hotel.application.core.domain.Address;

public interface FindAdressBbyZipCodeOutputPort {

    Address find(String zipCode);
}
