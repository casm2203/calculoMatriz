/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadinicio;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SAGICC
 */
public class calculo {

    int matriz[][] = new int[3][3];
    int sumM;

    public int[][] sumaMatriz(int[][] matriz1, int[][] matriz2) {
        int suma[][] = new int[3][3];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return suma;
    }

    public int[] diagonalPrincipal(int matriz[][]) {
        int diagoPrincipal[] = new int[3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    diagoPrincipal[i] = matriz[i][j];
                }
            }
        }
        return diagoPrincipal;
    }

    public int[] diagonalInversa(int matriz[][]) {
        int diagoSecundaria[] = new int[3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j == matriz.length - 1) {
                    diagoSecundaria[i] = matriz[i][j];
                }
            }
        }
        return diagoSecundaria;
    }

    public int sumaDiagonal(int vector[]) {
        int sumDiag = 0;
        for (int i = 0; i < vector.length; i++) {
            sumDiag = +vector[i];
        }
        return sumDiag;
    }

    public String diagonalMayor(int diagoPrin, int diagoSecun) {
        String respuesta;
        if (diagoPrin > diagoSecun) {
            respuesta = "Principal";
            return respuesta;
        } else {
            respuesta = "Inversa";
            return respuesta;
        }
    }

    public int[][] obtenerDataTable(JTable table) {
        int matrizTable[][] = new int[3][3];
        for (int i = 0; i < table.getRowCount(); i++) {
            for (int j = 0; j < table.getColumnCount(); j++) {
                matrizTable[i][j] = (int) table.getValueAt(i, j);
            }
        }
        return matrizTable;
    }

    public void mostrarMatriz(JTable table, int matriz[][]) {
        //model será un objeto
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        //model.setColumnCount(n);//cantidad de columnas
        // model.setRowCount(n);//cantidad de filas
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                table.setValueAt(matriz[i][j], i, j);
            }
        }

    }

    public int[][] llenarMatriz(int matriz[][]) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                try {
                    matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor para la fila [" + (i + 1) + "] en la columna [" + (j + 1) + "] de la matriz"));
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Ingrese solo números");
                    matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor para la fila [" + (i + 1) + "] en la columna [" + (j + 1) + "] de la matriz"));
                }
            }
        }

        return matriz;
    }

}
