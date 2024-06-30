public class Search_A_2D_matrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0;
        int high = matrix.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (search(matrix[mid], target)) {
                return true;
            }

            if (matrix[mid][0] < target) {
                low++;
            } else {
                high--;
            }
        }
        return false;
    }

    public boolean search(int[] list, int target) {
        for (int i : list) {
            if (i == target){
                return true;
            }
        }
        return false;
    }
}
