import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class Min_Stack_Test {

	public MinStack solution;
	
	@BeforeEach
	public void setup() {
		solution = new MinStack();
	}
	@Test
	@DisplayName("Complex palindrome test")
	public void case1() {
		
		

	}

	@ParameterizedTest
    @DisplayName("Parameterized test for palindromes")
    @ValueSource(strings = { "racecar", "level", "radar", "deified", "civic" })
    void testParameterizedPalindrome(String candidate) {
        // assertTrue(object.isPalindrome(candidate), "The word '" + candidate + "' should be a palindrome");
    }
}

