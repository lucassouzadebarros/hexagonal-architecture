package com.ntconsult.hotel.adapters.out.client.mapper;

import com.ntconsult.hotel.adapters.out.client.response.AddressResponse;
import com.ntconsult.hotel.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse address);

}
