package com.ntconsult.hotel.adapters.in.consumer.mapper;

import com.ntconsult.hotel.adapters.in.consumer.message.CustomerMessage;
import com.ntconsult.hotel.apllication.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMessageMapper {

    @Mapping(target = "address", ignore = true)
    Customer toCustomer(CustomerMessage customerMessage);

}
