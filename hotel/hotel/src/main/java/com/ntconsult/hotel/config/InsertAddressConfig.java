package com.ntconsult.hotel.config;

import com.ntconsult.hotel.adapters.out.InsertAddressAdapter;
import com.ntconsult.hotel.application.core.usercase.InsertAddressUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertAddressConfig {

    @Bean
    public InsertAddressUseCase insertAddressUseCase(InsertAddressAdapter insertAddressAdapter){
        return new InsertAddressUseCase(insertAddressAdapter);
    }
}
