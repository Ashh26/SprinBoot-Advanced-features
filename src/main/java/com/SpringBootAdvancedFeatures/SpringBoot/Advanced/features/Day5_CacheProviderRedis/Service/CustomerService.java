package com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day5_CacheProviderRedis.Service;

import com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day5_CacheProviderRedis.Entity.Customer;

import java.util.List;

public interface CustomerService {
    public Customer addCustomer(Customer customer);
    public List<Customer> getAllCustomer();
    public Customer getCustomerById(int id);
    public Customer updateCustomerById(int id,Customer newCustomer);
    public void deleteCustomerById(int id);
}
