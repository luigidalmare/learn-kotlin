package com.github.luigidalmare

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test


class CalculatorTest {

    val calculator = Calculator()

    @Test
    fun testMultiply(){

        val result1 = calculator.multiply(3, 2)
        assertThat(result1, `is`(6))

    }


    @Test
    fun testDivide(){

        val result1 = calculator.divide(6, 3)
        assertThat(result1, `is`(2))

        val result2 = calculator.divide(7, 3)
        assertThat(result2, `is`(2))

        val result3 = calculator.divide(8, 3)
        assertThat(result3, `is`(2))

        val result4 = calculator.divide(9, 3)
        assertThat(result4, `is`(3))

    }
}



