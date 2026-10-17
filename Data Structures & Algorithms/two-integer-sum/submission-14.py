class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        num_map: dict[int, int] = {}
        default_answer: list[int] = []

        for idx in range(0, len(nums), 1):
            number_to_seek: int = target - nums[idx]

            if number_to_seek in num_map:
                return [num_map.get(number_to_seek), idx]
            
            num_map[nums[idx]] = idx
        

        return default_answer