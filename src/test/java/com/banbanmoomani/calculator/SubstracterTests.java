package com.banbanmoomani.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SubstracterTests {

    @Test
    @DisplayName("2 빼기 1한 결과가 1인지 확인")

    public void testRemove() {

        int first = 2 ;
        int second = 1;

        int result = new Substracter() .remove(first ,second) ;

        Assertions.assertEquals ( 1,result  );


    }

}
