public class Veiculo{
    int ano;
    int chassi;
    float preco;
    float quilometragem;
    float SemParar;
    
    public void PagarPedagio(){
        //Este método será sobrescrito nas subclasses
    }
    
    public Veiculo(int ano, int chassi, float preco, float SemParar) {
        this.ano = ano;
        this.chassi = chassi;
        this.preco = preco;
        this.SemParar = SemParar;
    }
    
}