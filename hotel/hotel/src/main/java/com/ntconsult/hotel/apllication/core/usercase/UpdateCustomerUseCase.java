package com.ntconsult.hotel.apllication.core.usercase;

import com.ntconsult.hotel.apllication.core.domain.Customer;
import com.ntconsult.hotel.apllication.ports.in.FindCustomerByIdInputPort;
import com.ntconsult.hotel.apllication.ports.in.UpdateCustomerInputPort;
import com.ntconsult.hotel.apllication.ports.out.FindAdressBbyZipCodeOutputPort;
import com.ntconsult.hotel.apllication.ports.out.UpdateCustomerOutputPort;

public class UpdateCustomerUseCase implements UpdateCustomerInputPort {

    private final FindCustomerByIdInputPort findCustomerByIdInputPort;

    private final FindAdressBbyZipCodeOutputPort findAdressBbyZipCodeOutputPort;

    private final UpdateCustomerOutputPort updateCustomerOutputPort;
    public UpdateCustomerUseCase(
            FindCustomerByIdInputPort findCustomerByIdInputPort,
            FindAdressBbyZipCodeOutputPort findAdressBbyZipCodeOutputPort,
            UpdateCustomerOutputPort updateCustomerOutputPort
      ){
        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
        this.findAdressBbyZipCodeOutputPort = findAdressBbyZipCodeOutputPort;
        this.updateCustomerOutputPort = updateCustomerOutputPort;
    }

    @Override
    public void update(Customer customer, String zipCode){
        findCustomerByIdInputPort.find(customer.getId());
        var address = findAdressBbyZipCodeOutputPort.find(zipCode);
        updateCustomerOutputPort.update(customer);

    }
}
