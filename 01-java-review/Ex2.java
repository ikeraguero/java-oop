/* Desenvolva um programa em Java capaz de imprimir todas as tabuadas no intervalo de 1 a 10. A formatação da impressão deve seguir o padrão: 
"N x 1 = N" (substituindo "N" pelo número da tabuada). Ao final de cada tabuada, uma linha deve ser pulada.
*/

public class Ex2 {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++) {
            for(int j=1; j<=10; j++) {
                System.out.printf("%d x %d = %d \n", i, j, i*j);
            }
            System.out.printf("\n");
        }
    }
}