
public class Valid_Palindrome {
    
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }

        int pointer1 = 0;
        int pointer2 = s.length() - 1;

        while (pointer1 <= pointer2) {
            if (!Character.isLetter(s.charAt(pointer1))) {
                pointer1++;
            } else if (!Character.isLetter(s.charAt(pointer2))) {
                pointer2--;
            } else {
                if (Character.toLowerCase(s.charAt(pointer1)) != Character.toLowerCase(s.charAt(pointer2))) {
                    return false;
                }
                pointer1++;
                pointer2--;
            }
        }
        return true;
    }

    // public boolean isPalindromeRecursive(String s) {
    //     if (s.isEmpty()) {
    //         return true;
    //     }

    //     if (!Character.isLetter(s.charAt(0))) {
            
    //     }
    // }
}