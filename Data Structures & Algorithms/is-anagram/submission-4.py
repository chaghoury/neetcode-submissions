class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        first_map: dict[str, int] = {}
        second_map: dict[str, int] = {}

        for character in s:
            first_map[character] = first_map.get(character, 0) + 1

        for character in t:
            second_map[character] = second_map.get(character, 0) + 1
        

        return first_map == second_map