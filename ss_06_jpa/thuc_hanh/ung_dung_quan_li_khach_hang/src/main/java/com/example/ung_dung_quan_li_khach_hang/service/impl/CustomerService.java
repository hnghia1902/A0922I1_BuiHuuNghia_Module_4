package com.example.ung_dung_quan_li_khach_hang.service.impl;

import com.example.ung_dung_quan_li_khach_hang.model.Customer;
import com.example.ung_dung_quan_li_khach_hang.repository.ICustomerRepository;
import com.example.ung_dung_quan_li_khach_hang.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        customerRepository.remove(id);
    }
}
