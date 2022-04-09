package com.example.starter.service;

import com.example.starter.dto.SomeDTO;

import java.util.UUID;

/**
 * Class DummyServiceImpl that responsible for
 *
 * @author Mykola.Matsishin <br> created on 09 April 2022
 * @since 5.5
 */
public class DummyServiceImpl implements DummyService {
    @Override
    public SomeDTO doThis(String s) {
        final SomeDTO someDTO = new SomeDTO();
        someDTO.setName(s);
        someDTO.setId(UUID.randomUUID());
        return someDTO;
    }

    @Override
    public SomeDTO doThat(UUID id, String s) {
        final SomeDTO someDTO = new SomeDTO();
        someDTO.setName(s);
        someDTO.setId(id);
        return someDTO;
    }
}
