package com.banbanmoomani.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ModularTests {
    @Test
    @DisplayName("4를 3으로 나눈 나머지가 1인지 확인")
    public void testMod(){

        //given
        int first = 4;
        int second = 3;

        //when
        int result = new Modular().mod(first, second);

        //then(verify)
        Assertions.assertEquals(1, result);
    }

    @Test
    @DisplayName("13을 8로 나눈 나머지가 5인지 확인")
    public void testMod2(){

        //given
        int first = 13;
        int second = 8;

        //when
        int result = new Modular().mod(first, second);

        //then(verify)
        Assertions.assertEquals(5, result);
    }
}
