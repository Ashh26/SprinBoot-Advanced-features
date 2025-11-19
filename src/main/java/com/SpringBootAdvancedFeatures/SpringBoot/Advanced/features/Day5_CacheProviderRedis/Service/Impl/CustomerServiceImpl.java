package com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day5_CacheProviderRedis.Service.Impl;

import com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day5_CacheProviderRedis.Entity.Customer;
import com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day5_CacheProviderRedis.Repositories.CustomerRepository;
import com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day5_CacheProviderRedis.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    // Injecting Repository into service class
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    // run a fetch query in the Redis Database
    // to get a list of all the customers
    @Override
    public List<Customer> getAllCustomer() {
        List<Customer> CustomerList = new ArrayList<>();
        customerRepository.findAll().forEach(CustomerList::add);
        return CustomerList;
    }

    // fetch operation to get customer using an ID
    @Override
    public Customer getCustomerById(int id) {
        Optional<Customer> optionalCustomer
                = customerRepository.findById(String.valueOf(id));
        return optionalCustomer.orElse(null);
    }

    @Override
    public Customer updateCustomerById(int id, Customer newCustomer) {
        Optional<Customer> existingCustomer
                = customerRepository.findById(String.valueOf(id));

        if (existingCustomer.isPresent()) {
            Customer updatedCustomer
                    = existingCustomer.get();

            updatedCustomer.setName(newCustomer.getName());
            updatedCustomer.setPhone(newCustomer.getPhone());
            updatedCustomer.setEmail(newCustomer.getEmail());

            customerRepository.deleteById(String.valueOf(id));
            return customerRepository.save(updatedCustomer);
        }

        return null;
    }

    @Override
    public void deleteCustomerById(int id) {
        customerRepository.deleteById(String.valueOf(id));
    }
}
