package com.weimob.customer.export;

import com.weimob.customer.mapper.ConsumerMapper;
import com.weimob.customer.model.Consumer;
import com.weimob.customer.model.request.CustomerListDTO;
import com.weimob.customer.model.response.CustomerBO;
import com.weimob.customer.model.response.CustomerListBO;
import com.weimob.customer.service.CustomerServiceExport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceExportImpl implements CustomerServiceExport {
    @Autowired
    ConsumerMapper consumerMapper;
    /*服务的具体实现*/
    @Override
    public CustomerListBO customerList(CustomerListDTO customerListDTO) {
        int pid = customerListDTO.getPid();
        Consumer consumer = consumerMapper.selectByPrimaryKey(pid);
        //将Consumer转成CustomerBO，再封装到CustomerListBO中返回
        CustomerBO consumerBO = new CustomerBO(consumer.getId(),consumer.getConsumerName(),consumer.getPid());
        List<CustomerBO> customerBOList = new ArrayList<CustomerBO>();
        customerBOList.add(consumerBO);
        CustomerListBO customerListBO = new CustomerListBO();
        customerListBO.setCustomerBOList(customerBOList);
        return customerListBO;
    }

}
