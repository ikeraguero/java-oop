/* Complete o programa em Java apresentado. O arquivo principal não deve ser modificado. 

O arquivo veiculo deve conter os atributos: ano, chassi, preco, quilometragem, SemParar. Os dois primeiros são do tipo int, e os depois são do tipo float. SemParar é um atributo que representa uma quantia em dinheiro (qualquer alusão a uma empresa real é mera coincidência). Além dos atributos, há ainda o método PagarPedagio() e o método construtor que deve receber em ordem os seguintes argumentos: int ano, int chassi, float preco, float SemParar. 

O arquivo moto é uma classe que herda classe veiculo e que deve conter o atributo: cilindradas. Do tipo inteiro. Além do atributo,  há ainda o método PagarPedagio() que deve debitar 10 e o método construtor que deve receber em ordem os seguintes argumentos: int ano, int chassi, float preco, float SemParar, int cilindradas. Utilize SUPER() para chamar a superclasse e inicializar os atributos em comum.

O arquivo caminhao é uma classe que herda classe veiculo e que deve conter os atributos: CapacidadeTotal e CapacidadeAtual. Do tipo inteiro. Além dos atributos,  há ainda o método PagarPedagio() que deve debitar 40 e o método construtor que deve receber em ordem os seguintes argumentos: int ano, int chassi, float preco, float SemParar, int CapacidadeTotal. Utilize SUPER() para chamar a superclasse e inicializar os atributos em comum.  

O arquivo carro é uma classe que herda classe veiculo e que deve conter os atributos: automatico, frequencia e amplitude. Automatico é do tipo lógico e representa se o carro tem ou não câmbio automático. Frequencia e amplitude são objetos do tipo Radio. Além dos atributos,  há ainda o método PagarPedagio() que deve debitar 20 e o método construtor que deve receber em ordem os seguintes argumentos: int ano, int chassi, float preco, float SemParar, boolean automatico. Utilize SUPER() para chamar a superclasse e inicializar os atributos em comum.

O arquivo radio é uma classe sem herança  que deve conter os atributos: estacao, canal e volume. Do tipo String, inteiro e inteiro respectivamente.

Todas as classes devem ter gerados os getters e os setters dos seus atributos (mesmo que não sejam usados). No caso do arquivo caminhao o método para alterar o atributo CapacidadeAtual deve receber um valor do tipo inteiro que não ultrapasse CapacidadeTotal, do contrário uma mensagem deve ser exibida: "Carga excedida!". No caso do método construtor do radio, a estação AM deve ser inicializada em 20 e a estação FM deve ser inicializada em 80. Os métodos para aumentar e diminuir o valor do voleme devem incrimentar ou decrementar 10. O volume máximo não pode ultrapassar 100 e nem ficar abaixo de 0. Por fim, o método PagarPedagio() de cada classe deve imprimir: "Dinheiro: $$" (onde o $$ deve ser substituito pelo valor do atributo SemParar. E caso não exista valor suficiente para o pagar o pedágio a seguinte mensagem deve ser exibida: "Moto sem dinheiro suficiente!" (supondo que foi uma Moto que não tinha dinheiro).  */

public class Principal{
    public static void main(String[] args){
        Carro       veiculo1 = new Carro(2024, 12345, 90000, 100, true);
        Moto        veiculo2 = new Moto(2020, 23456, 20000, 200, 300);
        Caminhao    veiculo3 = new Caminhao(1984, 6789, 9999999, 500, 200);
        Carro       veiculo4 = new Carro(1984, 11111, 30000, 0, false);
        
        veiculo1.PagarPedagio();
        veiculo2.PagarPedagio();
        veiculo3.PagarPedagio();
        veiculo4.PagarPedagio();
        
        System.out.println(veiculo1.frequencia.getCanal());
        System.out.println(veiculo1.amplitude.getCanal());
        
        veiculo4.frequencia.DiminuirVolume();
        System.out.println(veiculo4.frequencia.getVolume());
        
        veiculo4.frequencia.AumentarVolume();
        veiculo4.frequencia.AumentarVolume();
        veiculo4.frequencia.AumentarVolume();
        System.out.println(veiculo1.frequencia.getVolume());
        System.out.println(veiculo4.frequencia.getVolume());
        
        System.out.println(veiculo3.getCapacidadeTotal());
        System.out.println(veiculo3.getCapacidadeAtual());
        veiculo3.setCapacidadeAtual(150);
        System.out.println(veiculo3.getCapacidadeAtual());
        veiculo3.setCapacidadeAtual(250);
        System.out.println(veiculo3.getCapacidadeAtual());

    }
}