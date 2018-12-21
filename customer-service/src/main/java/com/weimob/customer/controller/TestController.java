package com.weimob.customer.controller;

import com.weimob.customer.export.CustomerServiceExportImpl;
import com.weimob.customer.model.request.CustomerListDTO;
import com.weimob.customer.model.response.CustomerListBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    CustomerServiceExportImpl customerServiceExport;
    @RequestMapping("test")
    public CustomerListBO test(){
        CustomerListDTO customerListDTO = new CustomerListDTO(2);
        return customerServiceExport.customerList(customerListDTO);
    }
}
