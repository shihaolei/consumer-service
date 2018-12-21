package com.weimob.customer.export;

import com.weimob.customer.model.request.CustomerListDTO;
import com.weimob.customer.model.response.CustomerListBO;
import com.weimob.customer.service.CustomerServiceExport;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceExportImpl implements CustomerServiceExport {

    @Override
    public CustomerListBO customerList(CustomerListDTO customerListDTO) {
        return null;
    }
}
