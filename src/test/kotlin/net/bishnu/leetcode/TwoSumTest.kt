package net.bishnu.leetcode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TwoSumTest{
  @Test
  fun twoSumTest(){
    assertArrayEquals(intArrayOf(0,1), TwoSum().twoSum(intArrayOf(1,2,3), 3))
  }
}