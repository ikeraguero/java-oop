/* Criar um programa em Java com blocos independentes de código (switch case). O programa deve obedecer a seguinte ordem para cada opção numérica fornecida como entrada:

1. Ordenação:

    Leia um número inteiro positivo n. 
    Em seguida, leia uma sequência de n números inteiros. 
    Imprima os números em ordem crescente, com um espaçamento simples entre cada número.

2. Construção de Matriz

    Leia dois números inteiros positivos, n e m. 
    Em seguida leia uma quantidade de n × m números. 
    Considere esses números como elementos de uma matriz:
        n representa as linhas de uma matriz.
        m representa as colunas de uma matriz.
    Imprima a matriz de forma convencional:
        Os números da mesma linha devem estar separados por espaços. 
        Ao imprimir o último número de uma linha, faça uma quebra de linha.

3. Determinante da Matriz

    Leia um número inteiro positivo n. 
    Em seguida leia uma quantidade de n² números. 
    Considere esses números como elementos de uma matriz quadrada (An×n). 
    Calcule e imprima o determinante da matriz.

4. Soma de Matrizes

    Faça a leitura de duas matrizes:
        Matriz An×m.
        Matriz Bn×m.
    Some as matrizes A e B.
    Imprima a matriz resultante C da soma.

5. Multiplicação de Matrizes

    Faça a leitura de duas matrizes:
        Inicialmente leia um número m e n.
        Depois leia a Matriz An×m.
        Depois leia a Matriz Bm×n.
    Multiplique as matrizes A e B.
    Imprima a matriz resultante C da multiplicação.

Observações:

    Todas as impressões devem pular linha.
    O código deve priorizar a utilização de tipos orientadas a objetos (obs: Integer ao invés de int, contudo em algumas situações a utilização de tipos primitidos é permitida, usando-os dentro de laços de repetição por exemplo). O não cumprimento dessa regra resultará em descontos na nota final, mesmo que o sistema avalie seu código com nota 10 (dez). 
    Caso um número seja informado ao switch case fora do intervalo permitido, o programa deve simplesmente encerrar a execução.  */

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