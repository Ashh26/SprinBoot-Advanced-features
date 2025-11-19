package com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day5_CacheProviderRedis.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@RedisHash(value = "Customer")
public class Customer {

    @Id
    @Indexed          // "indexed" for faster retrieval,
                     // @Id for marking this field as the key
    private int id;
    private String name;
    private long phone;
    private String email;

}
