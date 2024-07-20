package com.ntconsult.hotel.config;

import com.ntconsult.hotel.adapters.out.FindAddressZipCodeAdapter;
import com.ntconsult.hotel.adapters.out.UpdateCustomerAdapter;
import com.ntconsult.hotel.application.core.usercase.FindCustomerByIdUseCase;
import com.ntconsult.hotel.application.core.usercase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressZipCodeAdapter findAddressByZipCodeAdapter,
            UpdateCustomerAdapter updateCustomerAdapter
    ) {
        return new UpdateCustomerUseCase(findCustomerByIdUseCase, findAddressByZipCodeAdapter, updateCustomerAdapter);
    }

}
