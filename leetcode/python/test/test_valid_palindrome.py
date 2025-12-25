import pytest
from valid_palindrome import ValidPalindrome

@pytest.mark.parametrize(
    "s,expected",
    [
        ("A man, a plan, a canal: Panama",True),
        ("race a car",False),
        (" ",True),
        (".,",True),
        ("0P",False),

    ]
)
def test_solve_with_slices(s: str,expected: bool):
    vp = ValidPalindrome()
    assert vp.solve_with_slices(s) == expected

