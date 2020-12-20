package com.midi79.springboot.web.dto;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloReponseDtoTest {

    @Test
    public void Rombok_function_test() {
        String name = "test";
        int amount = 1000;

        HelloReponseDto dto = new HelloReponseDto(name, amount);

        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
