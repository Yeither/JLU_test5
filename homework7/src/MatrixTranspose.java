public class MatrixTranspose {
    public static void main(String[] args) {
        // 原始矩阵
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        // 打印原始矩阵
        System.out.println("原始矩阵：");
        printMatrix(matrix);

        // 行列互换
        transpose(matrix);

        // 打印互换后的矩阵
        System.out.println("\n行列互换后的矩阵：");
        printMatrix(matrix);
    }

    // 行列互换方法
    public static void transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                // 交换元素
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    // 打印矩阵方法
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }
}
