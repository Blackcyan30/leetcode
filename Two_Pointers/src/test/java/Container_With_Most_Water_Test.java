import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Container_With_Most_Water_Test {
    public Container_With_Most_Water solution;
    @BeforeEach
    public void setUp() {
        solution = new Container_With_Most_Water();
    }

    @Test
    @DisplayName("Multiple Heights")
    public void multipleHeights() {
        int[] heights = {1,8,6,2,5,4,8,3,7};
        assertEquals(49, solution.maxArea(heights), "Did not get the expected height");
    }
    
}
