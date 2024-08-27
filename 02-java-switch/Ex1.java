/*Criar um programa em Java com blocos independentes de código (switch case). O programa deve obedecer a seguinte ordem para cada opção numérica fornecida como entrada:

1. Leitura e classificação de um número:

    Leia um número inteiro.
    Se o número for maior que 10, imprima "MAIOR".
    Caso contrário, imprima "MENOR".

2. Manipulação de um número:

    Leia um número inteiro.
    Se for múltiplo de 2:
        Multiplique o número por 5.
    Se for múltiplo de 3:
        Subtraia 1 do número.
    Se não for múltiplo de 2 e nem de 3:
        Não faça nada.
    Imprima o resultado final do número.

3. Leitura de palavras:

    Leia um número inteiro positivo.
    Leia uma quantidade de palavras (String) igual ao numero informado.
    Imprima as palavras separadas por espaço, da última para a primeira.

4. Cálculo do Máximo Divisor Comum (MDC):

    Leia dois números inteiros positivos.
    Calcule o MDC entre os dois números.
    Imprima o MDC.

5. Soma de números:

    Leia vários números inteiros até realizar a leitura de um não número.
    Calcule a soma de todos os números lidos.
    Imprima a soma final.

Observações:

    Todas as impressões devem pular linha.
    Caso um número seja informado ao switch case fora do intervalo permitido, o programa deve simplesmente encerrar a execução. */

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner var1= new Scanner(System.in);
        int n1 = var1.nextInt();
        
        
        switch(n1) {
            case 1: 
                int n2 = var1.nextInt();
                if(n2>10) {
                    System.out.print("MAIOR \n");
                } else {
                    System.out.print("MENOR \n");
                }
                break;
            case 2: 
                int n3 = var1.nextInt();
                if(n3%2==0) {
                     n3 = n3*5;
                } if(n3%3==0){
                    n3 = n3-1;
                } else {
                    System.out.printf("%d\n", n3);
                    break;
                }
                System.out.printf("%d\n", n3);
                break;
            case 3:
                int n4 = var1.nextInt();
                var1.nextLine();
                
                String[] words = new String[n4];
                for (int i=0; i<n4; i++) {
                    words[i] = var1.nextLine();
                }
                
                for(int i=n4-1; i>=0; i--) {
                    System.out.printf("%s ", words[i]);
                }
                break;
            case 4:
                int n5 = var1.nextInt();
                int n6 = var1.nextInt();
                while (n6 != 0) {
                    int temp = n6;
                    n6 = n5 % n6;
                    n5 = temp;
                }
                System.out.printf("%d\n", n5);
                break;
            case 5:
                int soma = 0;
                while (true) {
                    try {
                        int n7 = var1.nextInt();
                        soma += n7;
                    } catch(Exception e) {
                         break;
                    }
                }
                System.out.printf("%d\n", soma);
        }
}
}