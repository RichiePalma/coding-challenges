#https://leetcode.com/problems/valid-palindrome/description/
import re

class ValidPalindrome:
    def solve_with_slices(self, s: str) -> bool:
        s = re.sub(r'[^a-zA-Z0-9]', '', s.lower())
        return s == s[::-1]