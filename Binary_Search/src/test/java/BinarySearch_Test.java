import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;


class BinarySearch_Test {

	public BinarySearch solution;
	
	@BeforeEach
	public void setup() {
		solution = new BinarySearch();
	}
	@Test
	@DisplayName("Array with target at pos 4")
	public void case1() {
		int[] arr = {-1,0,3,5,9,12};
		int target = 9;
		assertEquals(4, solution.search(arr, target));
		// assertFalse(true);

	}

	@Test
	// @ParameterizedTest
    @DisplayName("Target does not exist")
    // @ValueSource(strings = { "racecar", "level", "radar", "deified", "civic" })
    void testParameterizedPalindrome() {
		int[] arr = {-1,0,3,5,9,12};
		int target = 2;
        assertEquals(-1, solution.search(arr, target));
    }
}

