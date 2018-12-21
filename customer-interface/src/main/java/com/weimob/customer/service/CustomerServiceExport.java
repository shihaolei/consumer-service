package com.weimob.customer.service;

import com.weimob.customer.model.request.CustomerListDTO;
import com.weimob.customer.model.response.CustomerListBO;

public interface CustomerServiceExport {
        public CustomerListBO customerList(CustomerListDTO customerListDTO);
}
