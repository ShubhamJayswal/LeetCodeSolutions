import java.io.*;
import java.util.*;
/* I am using hashMap to solve this problem. But the problem with hashMap is that it doesn't allow redundant keys. 
So I am still struggling with how to solve problems for inputs such as [3,3] where the hashmap 
would only add in the recent key which is 3 (according to the code). I know it's confusing but have a look at the code and 
it should make sense. */
public class TwoSumProblem {

    public int[] twoSum(int[] nums, int target){
       
        System.out.println("check");
        Map<Integer, Integer> finalMap = new HashMap<>(); // O(1)
        Map<Integer, Integer> map = new HashMap<>(); // O(1)
        for (int i = 0; i < nums.length; i++) {   // O(n)
            map.put(nums[i], i);
        }
        
        for(int key : map.keySet()) {   // O(n)
            int complement = target - key;
            if (map.containsKey(complement) && !finalMap.containsKey(map.get(complement)) ) {
                finalMap.put(map.get(key), map.get(complement));
                return new int[] { map.get(key), map.get(complement) };
            }
        }
        
       return null;
    }
    // Complexity is O(n)
}
