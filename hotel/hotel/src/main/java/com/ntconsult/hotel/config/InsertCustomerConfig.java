package com.ntconsult.hotel.config;

import com.ntconsult.hotel.adapters.out.FindAddressZipCodeAdapter;
import com.ntconsult.hotel.adapters.out.InsertAddressAdapter;
import com.ntconsult.hotel.adapters.out.InsertCustomerAdapter;
import com.ntconsult.hotel.adapters.out.SendCpfValidationAdapter;
import com.ntconsult.hotel.application.core.usercase.InsertCustomerUserCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUserCase insertCustomerUseCase(
            FindAddressZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter,
            SendCpfValidationAdapter sendCpfForValidationAdapter,
            InsertAddressAdapter insertAddressAdapter
    ) {
        return new InsertCustomerUserCase(findAddressByZipCodeAdapter, insertCustomerAdapter,
                sendCpfForValidationAdapter, insertAddressAdapter);
    }
}
