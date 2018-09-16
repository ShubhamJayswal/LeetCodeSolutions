import java.io.*;
import java.util.*;

public class TwoSumProblem {

    public int[] twoSum(int[] nums, int target){
       
        System.out.println("check");
        Map<Integer, Integer> finalMap = new HashMap<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        
        for(int key : map.keySet()) {
            int compliment = target - key;
            if (map.containsKey(compliment) && !finalMap.containsKey(map.get(compliment)) ) {
                finalMap.put(map.get(key), map.get(compliment));
                return new int[] { map.get(key), map.get(compliment) };
            }
        }
        
       return null;
    }
    
}
