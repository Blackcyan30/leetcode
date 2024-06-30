import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;


class ContainsDuplicate_Test {

	public ContainsDuplicate solution = new ContainsDuplicate();
	
	@BeforeEach
	public void setup() {
		solution = new ContainsDuplicate();
	}
	@Test
	@DisplayName("Contains Duplicate")
	public void case1() {
		assertTrue(solution.containsDuplicate(new int[] {1,2,3,1}));
	}

	@Test
	@DisplayName("Does not contain Duplicate")
    void case2() {
		assertFalse(solution.containsDuplicate(new int[] {1,2,3,4}));
    }

	@Test
	@DisplayName("Contains multiple duplicated")
	void case3() {
		assertTrue(solution.containsDuplicate(new int[] {1,1,1,3,3,4,3,2,4,2}));
	}
}

