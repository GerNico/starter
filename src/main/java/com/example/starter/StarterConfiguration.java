package com.example.starter;

import com.example.starter.service.DummyService;
import com.example.starter.service.DummyServiceImpl;
import com.example.starter.service.ServiceWithDependency;
import com.example.starter.service.ServiceWithDependencyImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Logger;

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

    @Bean
    @ConditionalOnMissingBean
    public ServiceWithDependency testBean(Logger logger, DummyService dummyService) {
        return new ServiceWithDependencyImpl(dummyService, logger);
    }
}
