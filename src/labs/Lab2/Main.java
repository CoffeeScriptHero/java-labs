package labs.Lab2;

public class Main {

  public static double[][] multiplyMatrices(double[][] matrix1, double[][] matrix2) {
    if (matrix1[0].length != matrix2.length) throw new ArithmeticException("Impossible to multiply matrices");

    double[][] resultMatrix = new double[matrix1.length][matrix2[0].length];

    for (int i = 0; i < matrix1.length; i++) {
      for (int j = 0; j < matrix2[0].length; j++) {
        for (int k = 0; k < matrix1[0].length; k++) {
          resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
        }
      }
    }
    return resultMatrix;
  }

  public static void printMatrix(double[][] matrix) {
    System.out.println("Матриця: ");
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.printf("%.2f  ", matrix[i][j]);
      }
      System.out.println();
    }
    System.out.println();
  }

  public static double sumMinColNumbers(double[][] matrix) {
    double sum = 0;
    double min;

    for (int i = 0; i < matrix[0].length; i++) {
      min = matrix[0][i];
      for (int j = 0; j < matrix.length; j++) {
        if (min > matrix[j][i]) min = matrix[j][i];
      }
      sum += min;
      System.out.printf("%d стовпчик, мінімум: %.2f\n", i, min);
    }
    System.out.println();
    return sum;
  }

  public static void main(String[] args) {
    int C5 = 1309 % 5; // 4, множення матриць
    int C7 = 1309 % 7; // 0, тип double
    int C11 = 1309 % 11; // 0, сума найменших елементів кожного стовпця матриці
    System.out.println(C5);
    System.out.println(C7);
    System.out.println(C11);
    System.out.println();

//    double[][] matrix1 = {{54, 312, 12}, {93, 44, 25}, {35, 11, 4}};
//    double[][] matrix2 = {{2, 1}, {4, 7}, {9, 3}};
//    double[][] matrix1 = {{5, 3}};
//    double[][] matrix2 = {{1, 75, 9, 4, 2, 7, 4}, {9, 4, 3, 29, 5, 4, 2}};
//    double[][] matrix1 = {{0, 0, 9}, {0, 3, 0}, {0, 0, 0}};
//    double[][] matrix2 = {{4, 1}, {2, 8}, {1, 5}};
    double[][] matrix1 = {{2.4, -3.1, 1}, {5.8, 4.65, -2.1}};
    double[][] matrix2 = {{-7, 5.9}, {2, -1.6}, {4, 3}};
    double[][] incorrectMatrix = {{2, 1}, {4, 7}, {9, 3}, {500, 300}};
    double[][] matrix3 = multiplyMatrices(matrix1, matrix2);

    printMatrix(matrix3);

    double sum = sumMinColNumbers(matrix3);
    System.out.printf("Сума найменших елементів кожного стовпця результ. матриці: %.2f\n", sum);

    double[][] matrix4 = multiplyMatrices(matrix1, incorrectMatrix);
  }
}
