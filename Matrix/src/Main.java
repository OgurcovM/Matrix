public class Main {
    public static void main(String[] args) {

        int [][] matrix1 = {{2,1,2},{1,2,3},{4,3,6}};
        int [][] matrix2 = {{1,2,3},{4,3,2},{5,6,7}};
        int number = 5;

        System.out.println("Матрица А: ");
        Matrix.MatrixVivod(matrix1);
        System.out.println("Матрица Б: ");
        Matrix.MatrixVivod(matrix2);
        System.out.println("Результат умножения двух матриц: ");
        int[][] ymnozhenie = Matrix.MatrixY(matrix1, matrix2);
        Matrix.MatrixVivod(ymnozhenie);
        System.out.println("Результат сложения двух матриц: ");
        int[][] slozhenie = Matrix.MatrixS(matrix1, matrix2);
        Matrix.MatrixVivod(slozhenie);
        System.out.println("Результат умножения матрицы на число: ");
        int[][] peremnoz = Matrix.MatrixNumber(matrix1, number);
        Matrix.MatrixVivod(peremnoz);
    }
}