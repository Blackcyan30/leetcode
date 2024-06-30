import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;



public class Two_Array_2_Input_Sorted_Test {

    // returns correct indices for a target sum in a sorted array
    @Test
    public void test_returns_correct_indices_for_target_sum() {
        Two_Array_2_Input_Sorted solution = new Two_Array_2_Input_Sorted();
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {1, 2};
        assertArrayEquals(expected, solution.twoSum(numbers, target));
    }

    // handles arrays with only two elements
    @Test
    public void test_handles_arrays_with_two_elements() {
        Two_Array_2_Input_Sorted solution = new Two_Array_2_Input_Sorted();
        int[] numbers = {2, 3};
        int target = 5;
        int[] expected = {1, 2};
        assertArrayEquals(expected, solution.twoSum(numbers, target));
    }

    // handles arrays with a mix of positive and negative numbers
    @Test
    public void test_handles_mix_of_positive_and_negative_numbers() {
        Two_Array_2_Input_Sorted solution = new Two_Array_2_Input_Sorted();
        int[] numbers = {-1, 0, 2, 4, -3};
        int target = 1;
        int[] expected = {4, 5};
        assertArrayEquals(expected, solution.twoSum(numbers, target));
    }

    // handles cases where the target sum is zero
    @Test
    public void test_handles_cases_where_target_sum_is_zero() {
        Two_Array_2_Input_Sorted solution = new Two_Array_2_Input_Sorted();
        int[] numbers = {0, 0, 0, 0};
        int target = 0;
        int[] expected = {1, 4};
        assertArrayEquals(expected, solution.twoSum(numbers, target));
    }

    // handles arrays with positive numbers correctly
    @Test
    public void test_handles_positive_numbers() {
        Two_Array_2_Input_Sorted solution = new Two_Array_2_Input_Sorted();
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {1, 2};
        assertArrayEquals(expected, solution.twoSum(numbers, target));
    }

    // handles arrays with negative numbers correctly
    @Test
    public void test_handles_negative_numbers() {
        Two_Array_2_Input_Sorted solution = new Two_Array_2_Input_Sorted();
        int[] numbers = {-3, -2, -1, 0};
        int target = -3;
        int[] expected = {1, 4};
        assertArrayEquals(expected, solution.twoSum(numbers, target));
    }

    // returns indices in ascending order
    @Test
    public void test_returns_indices_in_ascending_order() {
        Two_Array_2_Input_Sorted solution = new Two_Array_2_Input_Sorted();
        int[] numbers = {1, 3, 5, 7};
        int target = 8;
        int[] expected = {1, 4};
        assertArrayEquals(expected, solution.twoSum(numbers, target));
    }

    // works correctly when the target sum is the sum of the first and last elements
    @Test
    public void test_target_sum_first_and_last_elements() {
        Two_Array_2_Input_Sorted solution = new Two_Array_2_Input_Sorted();
        int[] numbers = {2, 7, 11, 15};
        int target = 17;
        int[] expected = {1, 4};
        assertArrayEquals(expected, solution.twoSum(numbers, target));
    }

    // works correctly when the target sum is the sum of two middle elements
    @Test
    public void test_target_sum_is_sum_of_middle_elements() {
        Two_Array_2_Input_Sorted solution = new Two_Array_2_Input_Sorted();
        int[] numbers = {2, 7, 11, 15};
        int target = 18;
        int[] expected = {2, 3};
        assertArrayEquals(expected, solution.twoSum(numbers, target));
    }

    // handles large arrays efficiently
    @Test
    public void test_handles_large_arrays_efficiently() {
        Two_Array_2_Input_Sorted solution = new Two_Array_2_Input_Sorted();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int target = 25;
        int[] expected = {10, 15};
        assertArrayEquals(expected, solution.twoSum(numbers, target));
    }

    // ensures the method terminates correctly when the target is found
    @Test
    public void test_terminates_correctly_when_target_found() {
        Two_Array_2_Input_Sorted solution = new Two_Array_2_Input_Sorted();
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {1, 2};
        assertArrayEquals(expected, solution.twoSum(numbers, target));
    }
}