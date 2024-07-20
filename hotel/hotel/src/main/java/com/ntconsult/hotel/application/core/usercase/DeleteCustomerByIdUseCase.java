package com.ntconsult.hotel.application.core.usercase;

import com.ntconsult.hotel.application.ports.in.DeleteCustomerByIdInputPort;
import com.ntconsult.hotel.application.ports.in.FindCustomerByIdInputPort;
import com.ntconsult.hotel.application.ports.out.DeleteCustomerByIdOutPutPort;

public class DeleteCustomerByIdUseCase implements DeleteCustomerByIdInputPort {

    private final FindCustomerByIdInputPort findCustomerByIdInputPort;

    private final DeleteCustomerByIdOutPutPort deleteCustomerByIdOutPutPort;

    public DeleteCustomerByIdUseCase(
            FindCustomerByIdInputPort findCustomerByIdInputPort,
            DeleteCustomerByIdOutPutPort deleteCustomerByIdOutPutPort
    ){
        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
        this.deleteCustomerByIdOutPutPort = deleteCustomerByIdOutPutPort;
    }
    @Override
    public void delete(Long id){
        findCustomerByIdInputPort.find(id);
        deleteCustomerByIdOutPutPort.delete(id);
    }
}
