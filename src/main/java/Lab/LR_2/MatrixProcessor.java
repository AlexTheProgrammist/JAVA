package Lab.LR_2;

import java.util.Random;
import java.util.Scanner;

public class MatrixProcessor {

    // Constants for random number range
    private static final int MIN_VALUE = -100;
    private static final int MAX_VALUE = 100;
    private static final int MAX_SIZE = 20;

    // Creating a matrix manually
    public static int[][] inputMatrix(int rows, int cols) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements:");
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                System.out.printf("Element [%d][%d]: ", r, c);
                matrix[r][c] = scanner.nextInt();
            }
        }
        return matrix;
    }

    // Generating a matrix randomly
    public static int[][] generateRandomMatrix(int rows, int cols) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                matrix[r][c] = random.nextInt(MAX_VALUE * 2 + 1) - MAX_VALUE;
            }
        }
        return matrix;
    }

    // Finding the minimum value
    public static int getMinElement(int[][] matrix) {
        int minValue = matrix[0][0];
        for (int[] row : matrix) {
            for (int num : row) {
                if (num < minValue) {
                    minValue = num;
                }
            }
        }
        return minValue;
    }

    // Finding the maximum value
    public static int getMaxElement(int[][] matrix) {
        int maxValue = matrix[0][0];
        for (int[] row : matrix) {
            for (int num : row) {
                if (num > maxValue) {
                    maxValue = num;
                }
            }
        }
        return maxValue;
    }

    // Calculating the arithmetic mean
    public static double computeArithmeticMean(int[][] matrix) {
        double sum = 0;
        int count = 0;

        for (int[] row : matrix) {
            for (int num : row) {
                sum += num;
                count++;
            }
        }
        return sum / count;
    }

    // Calculating the geometric mean
    public static double computeGeometricMean(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                if (num < 0) {
                    System.out.println("Geometric mean cannot be calculated due to negative values.");
                    return Double.NaN;
                }
            }
        }

        double product = 1;
        int count = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                product *= num;
                count++;
            }
        }
        return Math.pow(product, 1.0 / count);
    }

    // Printing the matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input matrix size
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        if (rows > MAX_SIZE || cols > MAX_SIZE) {
            System.out.println("Matrix size cannot exceed 20x20.");
            return;
        }

        // Choosing matrix creation method
        System.out.println("Choose matrix creation method:");
        System.out.println("1. Manual input");
        System.out.println("2. Random generation");
        int option = scanner.nextInt();

        int[][] matrix;
        if (option == 1) {
            matrix = inputMatrix(rows, cols);
        } else if (option == 2) {
            matrix = generateRandomMatrix(rows, cols);
        } else {
            System.out.println("Invalid choice.");
            return;
        }

        // Displaying and calculating results
        System.out.println("Matrix:");
        displayMatrix(matrix);

        int minValue = getMinElement(matrix);
        int maxValue = getMaxElement(matrix);
        double avgArithmetic = computeArithmeticMean(matrix);
        double avgGeometric = computeGeometricMean(matrix);

        System.out.println("Minimum element: " + minValue);
        System.out.println("Maximum element: " + maxValue);
        System.out.println("Arithmetic mean: " + avgArithmetic);
        System.out.println("Geometric mean: " + (Double.isNaN(avgGeometric) ? "Cannot be calculated" : avgGeometric));
    }
}
