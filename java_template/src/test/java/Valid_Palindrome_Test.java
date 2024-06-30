import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class Valid_Palindrome_Test {

	public Valid_Palindrome object = new Valid_Palindrome();
	
	@BeforeEach
	public void setup() {
		object = new Valid_Palindrome();
	}
	@Test
	@DisplayName("Complex palindrome test")
	public void case1() {
		assertTrue(object.isPalindrome("A man, a plan, a canal: Panama"), "The function returns false when it should return true.");
		// assertFalse(true);

	}

	@ParameterizedTest
    @DisplayName("Parameterized test for palindromes")
    @ValueSource(strings = { "racecar", "level", "radar", "deified", "civic" })
    void testParameterizedPalindrome(String candidate) {
        assertTrue(object.isPalindrome(candidate), "The word '" + candidate + "' should be a palindrome");
    }
}

