/*Desenvolva um programa em Java capaz de imprimir uma Tabela Verdade para a seguinte expressão: (X e Y) ou Z. A Tabela Verdade deve mostrar todas as combinações possíveis de true e false para as variáveis e seus respectivos resultados. Por exemplo:

    false e false ou false = false
    false e false ou true = true
    … (continue com as outras combinações com base no sistema binário)
*/

public class Ex3 {
    public static void main(String[] args) {
        for(int i=0; i<2; i++) {
            for (int j=0; j<2; j++) {
                for (int k=0; k<2; k++) {
                    boolean bi = i == 1;
                    boolean bj = j == 1;
                    boolean bk = k== 1;
                    boolean res = bi && bj || bk;
                    System.out.printf("%b e %b ou %b = %b \n", bi, bj, bk, res);
                }
            }
        }
}
}