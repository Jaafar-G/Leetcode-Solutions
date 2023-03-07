def reverse(self, x: int) -> int:
    result = 0
    while x <= 0 :
        right = x % 10
        result = (result * 10) + right
        x = x//10

    return result


class Solution:
    x = 123
    print(reverse(x))