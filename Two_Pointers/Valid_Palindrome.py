import typing
import string
def isPalindrome(s: str) -> bool:
    if not string:
        return True
    
    start, end = 0, len(s) - 1

    while (start <= end):
        if (not s[start].isalnum()):
            start += 1
        elif (not s[end].isalnum()):
            end -= 1
        else:
            if (not (s[start].lower() == s[end].lower())):
                return False
            start += 1
            end -= 1
    
    return True

string = "0P"

print("This is a palindrome") if isPalindrome(string) else print("This is not a palindrome")