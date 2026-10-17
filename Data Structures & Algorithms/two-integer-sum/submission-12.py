class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        num_map: dict[int, int] = {} # value, index
        indexes: list[int] = [0, 0]

        # [3,4,5,6]

        for idx in range(0, len(nums), 1):
            number_to_seek: int = target - nums[idx]

            if number_to_seek in num_map:
                indexes[0] = num_map.get(number_to_seek)
                indexes[1] = idx
                break
            
            num_map[nums[idx]] = idx
        

        return indexes