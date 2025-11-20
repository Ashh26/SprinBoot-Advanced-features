package com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day6_TransactionManagement.Services;

import com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day6_TransactionManagement.Entities.Address1;
import org.springframework.stereotype.Service;

@Service
public interface AddressService1 {
    public Address1 addAddress(Address1 address1);
}
