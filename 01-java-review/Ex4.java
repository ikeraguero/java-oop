/* Desenvolva um programa em Java capaz de imprimir os números da sequência de Fibonacci até 100 (não é para imprimir os cem primeiros números da sequência, apenas é para imprimir os números até o próximo ultrapassar cem). 
Os números devem ser separados por espaços, e não deve haver quebra de linha entre eles. */

public class Ex4 {
    public static void main(String[] args) {
        int anterior = 0;
        int atual = 1;
        int proximo = anterior + atual;
        
        System.out.printf("%d %d ", anterior, atual);
        do {
            anterior = atual;
            atual = proximo;
            proximo = anterior + atual;
            System.out.printf("%d ", atual);
        } while (proximo < 100);
        
}
}