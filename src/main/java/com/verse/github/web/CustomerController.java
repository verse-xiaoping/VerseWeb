package com.verse.github.web;

import com.verse.github.dao.domain.Customer;
import com.verse.github.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Auther：Verse
 * @Date：19-12-28 下午11:10
 * @Description：
 */
@Controller
public class CustomerController {
    private static final String QUERY = "query";
    @Autowired
    CustomerService customerService;

    @RequestMapping("/query")
    @ResponseBody
    public List<Customer> getQuery() {
        Customer customer = new Customer();
        customer.setMonth("1");
        List<Customer> musicInfoList = customerService.query(customer);
        return musicInfoList;
    }

    @RequestMapping("/insert")
    @ResponseBody
    public void insert() {
        int random=(int)(Math.random()*10+1);
        Customer customer = new Customer();
        customer.setName("xp" + random);
        customer.setPassword("123");
        customer.setAge("30");
        customer.setMonth("1");
        customerService.insert(customer);
    }
}
