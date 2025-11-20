package com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day6_TransactionManagement.Services.Impl;

import com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day6_TransactionManagement.Entities.Address1;
import com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day6_TransactionManagement.Repsitories.Address1Repository;
import com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day6_TransactionManagement.Services.AddressService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl1 implements AddressService1 {

    @Autowired
    private Address1Repository addressRepository;

    public Address1 addAddress(Address1 address) {
        return this.addressRepository.save(address);
    }

}
