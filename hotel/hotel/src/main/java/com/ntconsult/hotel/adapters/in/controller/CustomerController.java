package com.ntconsult.hotel.adapters.in.controller;

import com.ntconsult.hotel.adapters.in.controller.mapper.CustommerMapper;
import com.ntconsult.hotel.adapters.in.controller.request.CustomerRequest;
import com.ntconsult.hotel.adapters.in.controller.response.CustomerResponse;
import com.ntconsult.hotel.apllication.core.domain.Customer;
import com.ntconsult.hotel.apllication.ports.in.DeleteCustomerByIdInputPort;
import com.ntconsult.hotel.apllication.ports.in.FindCustomerByIdInputPort;
import com.ntconsult.hotel.apllication.ports.in.InsertCustomerInputPort;
import com.ntconsult.hotel.apllication.ports.in.UpdateCustomerInputPort;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    private InsertCustomerInputPort insertCustomerInputPort;

    @Autowired
    private CustommerMapper custommerMapper;

    @Autowired
    private FindCustomerByIdInputPort findCustomerByIdInputPort;

    @Autowired
    private UpdateCustomerInputPort updateCustomerInputPort;

    @Autowired
    private DeleteCustomerByIdInputPort deleteCustomerByIdInputPort;


    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest customerRequest){
        var customer = custommerMapper.toCustomer(customerRequest);
        insertCustomerInputPort.insert(customer, customerRequest.getZipCode());
        return  ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findbyId(@PathVariable final Long id){

        var customer = findCustomerByIdInputPort.find(id);
        var customerResponse = custommerMapper.toCustomerResponse(customer);

        return ResponseEntity.ok().body(customerResponse);

    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable final Long id,@Valid @RequestBody CustomerRequest customerRequest){
        Customer customer = custommerMapper.toCustomer(customerRequest);
        customer.setId(id);
        updateCustomerInputPort.update(customer, customerRequest.getZipCode());
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/id")
    public ResponseEntity<Void> delete(@PathVariable final Long id){
        deleteCustomerByIdInputPort.delete(id);
        return ResponseEntity.noContent().build();
    }
}
