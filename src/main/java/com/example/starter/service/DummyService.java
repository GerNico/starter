package com.example.starter.service;

import com.example.starter.dto.SomeDTO;

import java.util.UUID;

/**
 * Class Dummy that responsible for
 *
 * @author Mykola.Matsishin <br> created on 09 April 2022
 * @since 5.5
 */
public interface DummyService {

    SomeDTO doThis(String s);

    SomeDTO doThat(UUID id, String s);
}
