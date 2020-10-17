package com.github.luigidalmare

class Calculator {

    fun add(summand1: Int, summand2: Int): Int {
        return summand1 + summand2
    }

    fun multiply(factor1: Int, factor2: Int): Int {
        var added = 0
        var round = 1
        while (round <= factor2) {
            added = added + factor1
            round = round + 1
        }
        return added
    }

    fun divide(dividend: Int, divisor: Int) : Int {
        var thatManyTimes = 0

        while (multiply(thatManyTimes, divisor) < dividend) {
                thatManyTimes = thatManyTimes + 1
        }
        if (multiply(thatManyTimes, divisor) > dividend)
            thatManyTimes = thatManyTimes - 1
        return thatManyTimes
    }

}