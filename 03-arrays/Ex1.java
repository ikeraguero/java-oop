import java.util.Scanner;
import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int num1 = scan.nextInt();
        switch(num1) {
            case 1: 
                int num2 = scan.nextInt();
                int array[] = new int[num2];
                for (int i=0; i<num2; i++) {
                    int num3 = scan.nextInt();
                    array[i] = num3;
                };
                Arrays.sort(array);
                for (int i=0; i<num2; i++) {
                    System.out.printf("%d ", array[i]);
                }
                break;
            case 2:
                int n = scan.nextInt();
                int m = scan.nextInt();
                
                int arrayMatriz[][] = new int[n][m];
                for(int i=0; i<n; i++) {
                    for (int j=0; j<m; j++) {
                        int num3 = scan.nextInt();
                        arrayMatriz[i][j] = num3;
                    }
                }
                for(int i=0; i<n; i++) {
                    for (int j=0; j<m; j++) {
                        System.out.printf("%d ", arrayMatriz[i][j]);
                    }
                    System.out.printf("\n");
                }
                break;
            case 3:
                int num4 = scan.nextInt();
                if(num4 == 1) {
                    System.out.printf("%d", 1);
                    break;
                }
                int arrayMatriz2[][] = new int[num4][num4];
                for (int i=0; i<num4; i++) {
                    for(int j=0; j<num4; j++) {
                        int num3 = scan.nextInt();
                        arrayMatriz2[i][j] = num3;
                    }
                }
                if(num4 == 2) {
                    System.out.printf("%d", (arrayMatriz2[0][0] * arrayMatriz2[1][1]) - (arrayMatriz2[0][1] * arrayMatriz2[1][0]));
                    break;
                }
                if (num4 == 3) {
                    int determinante = arrayMatriz2[0][0] * (arrayMatriz2[1][1] * arrayMatriz2[2][2] - arrayMatriz2[1][2] * arrayMatriz2[2][1])
                    - arrayMatriz2[0][1] * (arrayMatriz2[1][0] * arrayMatriz2[2][2] - arrayMatriz2[1][2] * arrayMatriz2[2][0])
                    + arrayMatriz2[0][2] * (arrayMatriz2[1][0] * arrayMatriz2[2][1] - arrayMatriz2[1][1] * arrayMatriz2[2][0]);
                    System.out.printf("%d", determinante);
                    break;
                }
                break;
            case 4:
                int linha = scan.nextInt();
                int coluna = scan.nextInt();
                int matriz1[][] = new int[linha][coluna];
                int matriz2[][] = new int[linha][coluna];
                int soma[][] = new int[linha][coluna];
                for (int i=0; i<linha; i++) {
                    for(int j=0; j<coluna; j++) {
                        int num = scan.nextInt();
                        matriz1[i][j] = num;
                    }
                }
                for (int i=0; i<linha; i++) {
                    for(int j=0; j<coluna; j++) {
                        int num = scan.nextInt();
                        matriz2[i][j] = num;
                    }
                }
                for (int i=0; i<linha; i++) {
                    for(int j=0; j<coluna; j++) {
                        soma[i][j] = matriz1[i][j] + matriz2[i][j];
                        System.out.printf("%d ", soma[i][j]);
                    }
                    System.out.printf("\n");
                }
                break;
            case 5:
                int m_num = scan.nextInt();
                int n_num = scan.nextInt();
                int matriz_1[][] = new int[n_num][m_num];
                int matriz_2[][] = new int[m_num][n_num];
                int matriz_3[][] = new int[n_num][n_num];
                for (int i=0; i<n_num; i++) {
                    for (int j=0; j<m_num; j++) {
                        int num = scan.nextInt();
                        matriz_1[i][j] = num;
                    }
                }
                for (int i=0; i<m_num; i++) {
                    for (int j=0; j<n_num; j++) {
                        int num = scan.nextInt();
                        matriz_2[i][j] = num;
                    }
                }
                for (int i=0; i<n_num; i++) {
                   for(int j=0; j<n_num; j++) {
                       matriz_3[i][j] = 0;
                       for(int k=0; k<m_num; k++) {
                           matriz_3[i][j] += matriz_1[i][k] * matriz_2[k][j];
                       };
                      System.out.printf("%d ", matriz_3[i][j]); 
                   }
                   
                   System.out.printf("\n");
                }
                break;
               
        };
    }
}