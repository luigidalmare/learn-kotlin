/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package com.github.luigidalmare

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.objecttrouve.testing.matchers.ConvenientMatchers.anIterableOf
import kotlin.test.Test

class SortTest {

    @Test
    fun testSelectionSort() {
        val input: MutableList<Int> = mutableListOf(1, 2, 3, 3, 5, 8, 8)
        input.shuffle()

        Sort().selectionSort(input)

        assertThat(input, `is`(anIterableOf(Int::class.java)
                .exactly()
                .ordered()
                .withItems(
                        1, 2, 3, 3, 5, 8, 8
                )
        ))
    }

    @Test
    fun testInsertionSort() {
        val input: MutableList<Int> = mutableListOf(1, 2, 3, 3, 5, 8, 8)
        input.shuffle()

        Sort().insertionSort(input)

        assertThat(input, `is`(anIterableOf(Int::class.java)
                .exactly()
                .ordered()
                .withItems(
                        1, 2, 3, 3, 5, 8, 8
                )
        ))
    }

    @Test
    fun testBubbleSort() {
        val input: MutableList<Int> = mutableListOf(1, 2, 3, 3, 5, 8, 8)
        input.shuffle()

        Sort().bubbleSort(input)

        assertThat(input, `is`(anIterableOf(Int::class.java)
                .exactly()
                .ordered()
                .withItems(
                        1, 2, 3, 3, 5, 8, 8
                )
        ))
    }


    @Test
    fun testQuickSort1() {
        val input: MutableList<Int> = mutableListOf(1, 2, 3, 3, 5, 8, 8)
        input.shuffle()

        val result = Sort().quickSort(input)

        assertThat(result, `is`(anIterableOf(Int::class.java)
                .exactly()
                .ordered()
                .withItems(
                        1, 2, 3, 3, 5, 8, 8
                )
        ))
    }

    @Test
    fun testQuickSort2() {
        val input: MutableList<Int> = mutableListOf()
        input.shuffle()

        val result = Sort().quickSort(input)

        assertThat(result, `is`(anIterableOf(Int::class.java)
                .ofSize(0)
        ))
    }

    @Test
    fun testQuickSort3() {
        val input: MutableList<Int> = mutableListOf(1,1,1,1,1)
        input.shuffle()

        val result = Sort().quickSort(input)

        assertThat(result, `is`(anIterableOf(Int::class.java)
                .exactly()
                .ordered()
                .withItems(
                       1,1,1,1,1
                )
        ))
    }

    @Test
    fun testMergeSort1() {
        val input: MutableList<Int> = mutableListOf(1, 2, 3, 3, 5, 8, 8)
        input.shuffle()

        val result = Sort().mergeSort(input)

        assertThat(result, `is`(anIterableOf(Int::class.java)
                .exactly()
                .ordered()
                .withItems(
                        1, 2, 3, 3, 5, 8, 8
                )
        ))
    }


    @Test
    fun testMergeSort2() {
        val input: MutableList<Int> = mutableListOf(2,2,2)
        input.shuffle()

        val result = Sort().mergeSort(input)

        assertThat(result, `is`(anIterableOf(Int::class.java)
                .exactly()
                .ordered()
                .withItems(
                       2,2,2
                )
        ))
    }

    @Test
    fun testMergeSort3() {
        val input: MutableList<Int> = mutableListOf()
        input.shuffle()

        val result = Sort().mergeSort(input)

        assertThat(result, `is`(anIterableOf(Int::class.java)
                .ofSize(0)
        ))
    }
}