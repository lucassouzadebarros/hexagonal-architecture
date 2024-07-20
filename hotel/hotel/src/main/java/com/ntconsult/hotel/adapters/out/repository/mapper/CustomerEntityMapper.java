package com.ntconsult.hotel.adapters.out.repository.mapper;

import com.ntconsult.hotel.adapters.out.repository.entity.CustomerEntity;
import com.ntconsult.hotel.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);
}
