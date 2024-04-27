/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class array2dimensi {
    
    public static void main(String[] args) {
        // Mendefinisikan matriks 2x3
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };
        
        // Menampilkan matriks
        System.out.println("Matriks:");
        displayMatrix(matrix);
    }
    
    // Metode untuk menampilkan matriks
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
