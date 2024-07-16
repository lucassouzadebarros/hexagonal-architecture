package com.ntconsult.hotel.config;

import com.ntconsult.hotel.adapters.out.DeleteCustomerByIdAdapter;
import com.ntconsult.hotel.apllication.core.usercase.DeleteCustomerByIdUseCase;
import com.ntconsult.hotel.apllication.core.usercase.FindCustomerByIdUseCase;
import com.ntconsult.hotel.apllication.ports.in.FindCustomerByIdInputPort;
import com.ntconsult.hotel.apllication.ports.out.DeleteCustomerByIdOutPutPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerConfig {

    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            DeleteCustomerByIdAdapter deleteCustomerByIdAdapter
    ) {
        return new DeleteCustomerByIdUseCase(findCustomerByIdUseCase, deleteCustomerByIdAdapter);
    }
}
