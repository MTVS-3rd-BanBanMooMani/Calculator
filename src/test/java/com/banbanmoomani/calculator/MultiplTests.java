package com.banbanmoomani.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MultiplTests {

    @Test
    @DisplayName("3과 5를 곱한 결과가 15인지 확인")
    public void testMultipl1() {

        int first = 3;
        int second = 5;

        int result = new Multipl().multipl(first, second);

        Assertions.assertEquals(15, result);
    }

    @Test
    @DisplayName("12와 6를 곱한 결과가 72인지 확인")
    public void testMultipl2() {

        int first = 12;
        int second = 6;

        int result = new Multipl().multipl(first, second);

        Assertions.assertEquals(72, result);
    }

}
