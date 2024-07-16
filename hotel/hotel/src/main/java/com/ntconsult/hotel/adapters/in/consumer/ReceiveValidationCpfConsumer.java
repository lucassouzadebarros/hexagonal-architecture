package com.ntconsult.hotel.adapters.in.consumer;

import com.ntconsult.hotel.adapters.in.consumer.mapper.CustomerMessageMapper;
import com.ntconsult.hotel.adapters.in.consumer.message.CustomerMessage;
import com.ntconsult.hotel.apllication.core.domain.Customer;
import com.ntconsult.hotel.apllication.ports.in.UpdateCustomerInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveValidationCpfConsumer {

    @Autowired(required=true)
    private UpdateCustomerInputPort updateCustomerInputPort;

    @Autowired
    private CustomerMessageMapper customerMessageMapper;


    @KafkaListener(topics = "tt-cpf-validation", groupId = "arantes")
    public void receive(CustomerMessage customerMessage){
        var customer = customerMessageMapper.toCustomer(customerMessage);
        updateCustomerInputPort.update(customer, customerMessage.getZipCode());
    }
}
