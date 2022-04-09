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
    private final HelperClass helper;

    public ServiceWithDependencyImpl(DummyService dummyService, HelperClass helper) {
        this.dummyService = dummyService;
        this.helper = helper;
    }

    @Override
    public SomeDTO doThisAndLog(String s) {
        final String newS = helper.doSomething(s);
        return dummyService.doThis(newS);
    }
}
