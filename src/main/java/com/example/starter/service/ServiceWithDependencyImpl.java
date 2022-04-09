package com.example.starter.service;

import com.example.starter.dto.SomeDTO;

import java.util.logging.Logger;

/**
 * Class ServiceWithDependencyImpl that responsible for
 *
 * @author Mykola.Matsishin <br> created on 09 April 2022
 * @since 5.5
 */
public class ServiceWithDependencyImpl implements ServiceWithDependency {
    private final DummyService dummyService;
    private final Logger logger;

    public ServiceWithDependencyImpl(DummyService dummyService, Logger logger) {
        this.dummyService = dummyService;
        this.logger = logger;
    }

    @Override
    public SomeDTO doThisAndLog(String s) {
        logger.info("we are doing this " + s);
        return dummyService.doThis(s);
    }
}
