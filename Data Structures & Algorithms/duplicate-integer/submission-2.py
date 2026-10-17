class Solution:
    def hasDuplicate(self, nums: list[int]) -> bool:
        num_set: set[int] = set()

        for num in nums:
            if num in num_set:
                return True
            num_set.add(num)
        
        return False