/*Desenvolva um programa em Java capaz de imprimir todos os números primos menores que 100. 
Os números devem ser separados por espaços, e não deve haver quebra de linha entre eles (o número 1 NÃO É PRIMO). */


public class Ex5 {
    public static void main(String[] args) {
        int num = 2;
        do {
            boolean primo = true;
            for(int i=2; i<=num/2; i++) {
                if(num %i == 0) {
                    primo = false;
                    break;
                }
            }
            if(primo) {
                System.out.printf("%d ", num);
            }
            num++;
        } while( num <= 100);
        
}
}