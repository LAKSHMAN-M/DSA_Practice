package com.sorting;

public class FirstMissingNumber {
    public static void main(String[] args) {
        FirstMissingNumber obj = new FirstMissingNumber();
        int nums[] = {-1, -1, -1, -2, 0};
        System.out.println(obj.firstMissingPositive(nums));
    }

    public int firstMissingPositive(int[] nums) {
        // simple cyclic sort
        int i = 0; // index
        while (i < nums.length) {
            int ci = nums[i] - 1; // ci = correct index
            if (ci > nums.length ||  ci < 0) {
                i++;
                continue;
            }
            if(nums[i] > 0 && nums[ci] != nums[i]){
                int temp = nums[ci];
                nums[ci] = nums[i];
                nums[i] = temp;
            }else i++;
        }

        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return i + 1;
    }

    private boolean checkCondition(int i, int ci, int[] nums) {
        // explicitly return a boolean value
        return ci > 0 && ci < nums.length && nums[ci] != nums[i]; // removed ci != i check
    }
}
