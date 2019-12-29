package com.verse.github.service.impl;

import com.verse.github.dao.domain.Customer;
import com.verse.github.dao.mapper.CustomerMapper;
import com.verse.github.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther：Verse
 * @Date：19-12-28 下午11:08
 * @Description：
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public List<Customer> query(Customer customer) {
        return customerMapper.query(customer);
    }

    @Override
    public void insert(Customer customer) {
        customerMapper.insert(customer);
    }
}
