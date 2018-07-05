package com.ass.sevice.Impl;

import com.ass.domin.Dormitory;
import com.ass.domin.customer;
import com.ass.mapper.CustomerMapper;
import com.ass.mapper.DormitoryMapper;
import com.ass.sevice.CustomerSave;
import com.ass.sevice.DormitorySave;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerSaveImpl implements CustomerSave {
    @Autowired
    private CustomerMapper customerMapper;

    public void save(customer customer) {
        customerMapper.saveCustomer(customer);
    }
}
