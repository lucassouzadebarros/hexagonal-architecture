package com.ntconsult.hotel.adapters.in.controller.mapper;

import com.ntconsult.hotel.adapters.in.controller.request.CustomerRequest;
import com.ntconsult.hotel.adapters.in.controller.response.CustomerResponse;
import com.ntconsult.hotel.apllication.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.Optional;

@Mapper(componentModel = "spring")
public interface CustommerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);

    CustomerResponse toCustomerResponse(Optional<Customer> customer);
}
