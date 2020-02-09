package com.joeso.unittest;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator mCalculator;

    @Before
    public void setUp() throws Exception {
        mCalculator = new Calculator();
    }

    @Test
    public void sum() {
        assertEquals(mCalculator.sum(3,4),7);
    }

    @Test
    public void sum2() throws Exception {
        assertEquals(mCalculator.sum(3,4),6);
    }

}