import java.util.HashMap;    //import lol

public class Solution {

    public static int[] twoSum(int[] nums, int target) {
            
            HashMap<Integer, Integer> hashbrown = new HashMap<>(); //hashmap
    
            for (int i = 0; i < nums.length; i++) {     //i is index (count from 0) idk how to enumerate so ig its c++ methods now
    
                int currentEntry = nums[i];    //currentEntry is current entry as according to index, cycle thru
                if (hashbrown.containsKey(target - currentEntry)) { //if target-currentEntry is already in the hashmap
                    
                    return new int[] {hashbrown.get(target-currentEntry), i};  //return the value of target-currentEntry and index of currentEntry
                }
                hashbrown.put(currentEntry, i);     //else, add the currentEntry and the index
            }
    
            return new int[]{};       //else, return nothing :(
        }

    public static void main(String[] args) {
        
        int[] nums = {1, 2, 3, 4};
        int target = 5;
        int[] result = twoSum(nums, target);
        
        System.out.println(result[0] + ", " + result[1]);
    }
}
