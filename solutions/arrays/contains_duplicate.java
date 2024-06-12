// Duplicate Integer

// Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

// Example 1:

// Input: nums = [1, 2, 3, 3]

// Output: true
// Example 2:

// Input: nums = [1, 2, 3, 4]

// Output: false


class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean isDuplicate = false;

        for (int i = 1; i < nums.length; i++) {
          for (int j = i-1; j >= 0; j--) {
            if (nums[i] == nums[j]) {
                isDuplicate = true;
            }
          }
        }

        return isDuplicate;
    }
}


