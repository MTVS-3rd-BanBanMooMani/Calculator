package com.banbanmoomani.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DividerTests {
    @Test
    @DisplayName("2과1를 나누면 2인지")
    public void dividetest() {
        //given
        int a = 2;
        int b = 1;

        //when
        int result = new Divider().divide(a , b);

        //then
        Assertions.assertEquals(2, result);
    }
    @Test
    @DisplayName("2과0를 나누면 오류나는지")
    public void dividetest2() {
        //given
        int a = 2;
        int b = 0;
        
        //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Divider().divide(a , b));
    }
}
