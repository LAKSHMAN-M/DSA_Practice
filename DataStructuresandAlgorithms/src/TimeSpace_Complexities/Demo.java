package TimeSpace_Complexities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        int nums[] = {1 ,1, 2 ,1};
        System.out.println(majorityElement(nums));
    }
    public static List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int noofTimes = nums.length / 3;
        for(int i : nums){
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> map : hm.entrySet()){
            if(map.getValue() > noofTimes){
                list.add(map.getKey());
            }
        }
        return list;
    }
}
