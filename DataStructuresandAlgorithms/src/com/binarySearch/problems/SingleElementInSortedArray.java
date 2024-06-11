package com.binarySearch.problems;

public class SingleElementInSortedArray {
    public static void main(String[] args) {
        int[] arr = {3,3,7,7,10,11,11};
//        int ans = solution(arr);
        System.out.println(singleNonDuplicate(arr));
    }
    static int solution(int arr[]){
        int st = 0;
        int end = arr.length - 1;
        while(st <= end ){
            int mid = st + ( end - st ) / 2;
            if(mid > st && arr[mid] == arr[mid - 1]){
                if(mid < end && (end - mid) % 2 != 0){
                    st = mid + 1;
                }else{
                    if(mid > st + 1)
                        end = mid - 2;
                }
            }else if (mid < end && arr[mid] == arr[mid + 1]){
                if(mid > st && (mid - st) % 2 != 0){
                    end = mid - 1;
                }else{
                    st = mid + 2;
                }
            }else{
                return arr[mid];
            }
        }
        return -1;
    }

    public static int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (mid % 2 == 1) {
                mid--;
            }
            if (nums[mid] != nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 2;
            }
        }
        return nums[left];
    }
}
