import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
public class Search_A_2D_matrix_Test {

    public Search_A_2D_matrix solution;

	@BeforeEach
	public void setup() {
		solution = new Search_A_2D_matrix();
	}

	@Test
	@DisplayName("Array with a target that exists")
	public void case1() {
		int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		int target = 3;
		assertTrue(solution.searchMatrix(arr, target));
	}

	@Test
	
    @DisplayName("Target does not exist")
    void testParameterizedPalindrome() {
		int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		int target = 13;
        assertFalse(solution.searchMatrix(arr, target));
    }
}



