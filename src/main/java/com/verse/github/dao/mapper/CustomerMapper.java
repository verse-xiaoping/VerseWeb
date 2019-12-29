package com.verse.github.dao.mapper;

import com.verse.github.dao.domain.Customer;

import java.util.List;

/**
 * @Auther：Verse
 * @Date：19-12-28 下午10:58
 * @Description：
 */
public interface CustomerMapper {
    List<Customer> query(Customer customer);

    void insert(Customer customer);
}
