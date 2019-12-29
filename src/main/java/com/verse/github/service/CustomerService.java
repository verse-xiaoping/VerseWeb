package com.verse.github.service;

import com.verse.github.dao.domain.Customer;

import java.util.List;

/**
 * @Auther：Verse
 * @Date：19-12-28 下午11:06
 * @Description：
 */
public interface CustomerService {
    public List<Customer> query(Customer customer);

    public void insert(Customer customer);
}
