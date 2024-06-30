

/***
 * You are given an integer array height of length n. 
 * There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 * Find two lines that together with the x-axis form a container, 
 * such that the container contains the most water.
 * Return the maximum amount of water a container can store.
 * Notice that you may not slant the container.
 * 
 * Example 1:
 * Input: height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 * Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. 
 * In this case, the max area of water (blue section) the container can contain is 49.
 * 
 * Example 2:
 * Input: height = [1,1]
 * Output: 1
*/

/**
 *  This solution has a runtime of 4ms and consumes memory space 56.83MB
 */
public class Container_With_Most_Water {

    
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        
        int max = 0;
        while (left <= right) {
            int currentArea = Math.min(heights[left], heights[right]) * (right - left);
            if (max < currentArea) {
                max = currentArea;
            }
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}
