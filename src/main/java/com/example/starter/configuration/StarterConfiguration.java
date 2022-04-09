package com.example.starter.configuration;

import com.example.starter.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Class StarterConfiguration that responsible for
 *
 * @author Mykola.Matsishin <br> created on 09 April 2022
 * @since 5.5
 */
@Configuration
@ConditionalOnProperty(prefix = "my.custom", name = "use-default")
@EnableConfigurationProperties(StarterProperties.class)
public class StarterConfiguration {
    @Autowired
    private StarterProperties properties;

    @Bean
    @ConditionalOnMissingBean
    public DummyService dummyService() {
        return new DummyServiceImpl();
    }

    @Bean
    @ConditionalOnMissingBean
    public ServiceWithDependency serviceWithDependency(HelperClass helperClass, DummyService dummyService) {
        return new ServiceWithDependencyImpl(dummyService, helperClass);
    }
}
