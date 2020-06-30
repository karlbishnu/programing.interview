package net.bishnu.leetcode

class TwoSum{
  fun twoSum(nums: IntArray, target: Int): IntArray{
    val map = mutableMapOf<Int, Int>()
    nums.forEachIndexed{  index, it ->
      if (map.contains(target-it))
        return intArrayOf(map.getOrDefault(target-it, 0), index)
      else
        map.put(it, index)
    }
    return intArrayOf()
  }
}