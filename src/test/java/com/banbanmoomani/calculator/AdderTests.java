package com.banbanmoomani.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AdderTests {

    @Test
    @DisplayName("1과 2를 더한 결과가 3인지 확인")
    public void testAdd1() {
        // given
        int first = 1;
        int second = 2;

        // when
        int result = new Adder().add(first, second);

        // then(verify)
        Assertions.assertEquals(3, result); // 3이라는 값을 기대하고 있는데 확인해줘
    }

    @Test
    @DisplayName("2와 3을 더한 결과가 5인지 확인")
    public void testAdd2() {
        // given
        int first = 2;
        int second = 3;

        // when
        int result = new Adder().add(first, second);

        // then(verify)
        Assertions.assertEquals(5, result); // 3이라는 값을 기대하고 있는데 확인해줘
    }
}
