package com.example.starter.service;

import com.example.starter.dto.SomeDTO;

/**
 * Interface ServiceWithDependency responsible for
 *
 * @author Mykola.Matsishin <br> created on 09 April 2022
 * @since 5.5
 */
public interface ServiceWithDependency {

    SomeDTO doThisAndLog(String s);
}
