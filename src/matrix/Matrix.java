11
1/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

/**
 *
 * @author Classic
 */
import javax.swing.JOptionPane;
public class Matrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int barisA=Integer.valueOf(JOptionPane.showInputDialog(null,"masukan jumlah baris Matriks A ->> "," "));
            int kolomA=Integer.valueOf(JOptionPane.showInputDialog(null,"masukan jumlah kolom Matriks A ->> "," "));

            System.out.print("untuk matriks A\n");
            int matrikA[][]=new int[barisA][kolomA];
            for (int i=0; i<barisA; i++ ){
                System.out.print("|");
                    for (int j=0; j<kolomA;j++ ){
                        matrikA[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null,"nilai matrik A baris ke "+(i+1) + " kolom ke " +(j+1)+" : "," "));
System.out.print(" "+matrikA[i][j]+" ");
                    }
System.out.println("|");
                }
            int barisB=Integer.valueOf(JOptionPane.showInputDialog(null,"masukan jumlah baris Matriks B ->> "," "));
            int kolomB=Integer.valueOf(JOptionPane.showInputDialog(null,"masukan jumlah kolom Matriks B ->> "," "));

            System.out.print("untuk matriks B\n");
            int matrikB[][]=new int[barisB][kolomB];
            for (int i=0; i<barisB; i++ ){
                System.out.print("|");
                    for (int j=0; j<kolomB;j++ ){
                        matrikB[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null,"nilai matrik B baris ke "+(i+1) + " kolom ke " +(j+1)+" : "," "));
                        System.out.print(" "+matrikB[i][j]+" ");
}
            System.out.println("|");
            }

            //syarat untuk perkalian kolom matrik A harus sama dengan baris matrik B
            if(matrikA[0].length==matrikB.length){
                int matrikhasil[][] = new int[matrikA.length][matrikB.length];
                perkalian(matrikA,matrikB,matrikhasil);
                lihat(matrikhasil);
            }
            else{
                System.out.println("jumlah kolom matrikA tidak sama dengan baris matrikB");
            }
        }
     public static void perkalian(int A[][],int B[][], int C[][]){
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                for (int k = 0; k < A[i].length; k++) {
                    C[i][j]+=A[i][k]*B[k][j];
                }
            }

        }
    }


          public static void lihat(int C[][]){
        System.out.println("Hasil matrik");
        for(int i=0; i<C.length; i++){
            System.out.print("|");
            for(int j=0; j<C[0].length; j++){

                System.out.print(" " + C[i][j] + " ");
            }
            System.out.println("|");
        }
    }
}
