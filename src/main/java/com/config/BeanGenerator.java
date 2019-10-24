package com.config;

import com.entity.GroupBorrower;
import com.entity.SingleBorrower;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanGenerator {
    @Bean
    public GroupBorrower groupBorrower(){
        return new GroupBorrower();
    }

    @Bean
    public SingleBorrower singleBorrower(){
        return new SingleBorrower();
    }
}
