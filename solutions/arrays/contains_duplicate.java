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


