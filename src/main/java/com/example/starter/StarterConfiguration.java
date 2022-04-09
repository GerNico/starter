package com.example.starter;

import com.example.starter.service.DummyService;
import com.example.starter.service.DummyServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Class StarterConfiguration that responsible for
 *
 * @author Mykola.Matsishin <br> created on 09 April 2022
 * @since 5.5
 */
@Configuration
public class StarterConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public DummyService testBean() {
        return new DummyServiceImpl();
    }
}
