package com.ntconsult.hotel.apllication.core.usercase;

import com.ntconsult.hotel.apllication.core.domain.Address;
import com.ntconsult.hotel.apllication.core.domain.Customer;
import com.ntconsult.hotel.apllication.ports.in.InsertCustomerInputPort;
import com.ntconsult.hotel.apllication.ports.out.FindAdressBbyZipCodeOutputPort;
import com.ntconsult.hotel.apllication.ports.out.InsertAddressOutputPort;
import com.ntconsult.hotel.apllication.ports.out.InsertCustomerOutputPort;
import com.ntconsult.hotel.apllication.ports.out.SendCpfForValidationOutputPort;

public class InsertCustomerUserCase implements InsertCustomerInputPort {

    private final FindAdressBbyZipCodeOutputPort findAdressBbyZipCodeOutputPort;

    private final InsertCustomerOutputPort insertCustomerOutputPort;

    private final SendCpfForValidationOutputPort sendCpfForValidationOutputPort;

    private final InsertAddressOutputPort insertAddressOutputPort;

    public  InsertCustomerUserCase(
            FindAdressBbyZipCodeOutputPort findAdressBbyZipCodeOutputPort,
            InsertCustomerOutputPort insertCustomerOutputPort,
            SendCpfForValidationOutputPort sendCpfForValidationOutputPort,
            InsertAddressOutputPort insertAddressOutputPort){
        this.findAdressBbyZipCodeOutputPort = findAdressBbyZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
        this.sendCpfForValidationOutputPort = sendCpfForValidationOutputPort;
        this.insertAddressOutputPort = insertAddressOutputPort;
    }

    @Override
    public void insert(Customer customer, String zipCode){
        Address address = findAdressBbyZipCodeOutputPort.find(zipCode);
        insertAddressOutputPort.insert(address);
        address.setId(1L);
        customer.setAddress(address);
        insertCustomerOutputPort.insert(customer);
        sendCpfForValidationOutputPort.send(customer.getCpf());
    }
}
