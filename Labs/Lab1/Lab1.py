class Solution(object):
    def twoSum(self, nums, target):     #inputs: array nums, int target

        hashbrown = {}                              #hashmap
        for i, currentEntry in enumerate(nums):     #i is index (count from 0), currentEntry is currentEntry, use enumerate to add to hashmap

            if ((target - currentEntry) in hashbrown) : #if target-currentEntry is already in the hashmap
                return(hashbrown.get(target-currentEntry), i)  #return the value of target-currentEntry and index of currentEntry
            
            hashbrown.update({currentEntry: i})     #else, add the currentEntry and the index
        
        return("none :(")       #else, return nothing :(


test = Solution()
print(test.twoSum([1, 2, 3, 4, 5], 9))
print(test.twoSum([123, 32, 2, 34123, 44], 3))
print(test.twoSum([2, 3, 4, 6], 10))
