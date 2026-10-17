class Solution:
    def generate_map(self, value: str) -> dict[str, int]:
        map_values: dict[str, int] = {}

        for val in value:
            map_values[val] = map_values.get(val, 0) + 1

        return map_values

    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        first_map: dict[str, int] = self.generate_map(s)
        second_map: dict[str, int] = self.generate_map(t)

        return first_map == second_map

# shifoooooooooooooooooo
# shifo