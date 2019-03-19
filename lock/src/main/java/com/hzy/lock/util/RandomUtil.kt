package com.hzy.lock.util

import java.util.*

/**
 * Random utilities.
 * @author: ziye_huang
 * @date: 2019/3/18
 */
object RandomUtil {

    private val RANDOM = Random()

    /**
     * Generates a random integer
     */
    fun randInt() = RANDOM.nextInt((System.nanoTime() % Integer.MAX_VALUE).toInt())

    /**
     * Generates a random integer within `[0, max)`.
     *
     * @param max The maximum bound
     * @return A random integer
     */
    fun randInt(max: Int) = if (max > 0) randInt() % max else 0

    /**
     * Generates a random integer array which has length of `end - start`,
     * and is filled by all values from `start` to `end - 1` in randomized orders.
     *
     * @param start The starting value
     * @param end   The ending value
     * @return The random integer array. If `end <= start`, an empty array is returned
     */
    fun randIntArray(start: Int, end: Int): IntArray {
        if (end <= start) return IntArray(0)

        val values = arrayListOf<Int>()
        for (i in start until end) {
            values.add(i)
        }

        val result = IntArray(values.size)
        for (i in result.indices) {
            val k = randInt(values.size)
            result[i] = values[k]
            values.removeAt(k)
        }
        return result
    }

    /**
     * Generates a random integer array which has length of `end`,
     * and is filled by all values from `0` to `end - 1` in randomized orders.
     *
     * @param end The ending value
     * @return The random integer array. If `end <= start`, an empty array is returned
     */
    fun randIntArray(end: Int) = randIntArray(0, end)
}