package com.ntconsult.hotel.config;

import com.ntconsult.hotel.adapters.out.DeleteCustomerByIdAdapter;
import com.ntconsult.hotel.application.core.usercase.DeleteCustomerByIdUseCase;
import com.ntconsult.hotel.application.core.usercase.FindCustomerByIdUseCase;
import com.ntconsult.hotel.application.ports.in.FindCustomerByIdInputPort;
import com.ntconsult.hotel.application.ports.out.DeleteCustomerByIdOutPutPort;
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
