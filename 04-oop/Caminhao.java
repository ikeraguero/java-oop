public class Caminhao extends Veiculo{
    int CapacidadeTotal;
    int CapacidadeAtual;
    
    public void PagarPedagio() {
        if(this.SemParar < 40) {
            System.out.printf("Carro sem dinheiro suficiente!\n");
            return;
        }
        this.SemParar -= 40;
        System.out.printf("Dinheiro: %.1f\n", this.SemParar);
    }
    
    public Caminhao(int ano, int chassi, float preco, float SemParar, int CapacidadeTotal) {
        super(ano, chassi, preco, SemParar);
        this.CapacidadeTotal = CapacidadeTotal;
        
    }
    
    public int getCapacidadeTotal() {
        return CapacidadeTotal;
    }
    
    public void setCapacidadeTotal(int value) {
        this.CapacidadeTotal = value;
    }
    
    public int getCapacidadeAtual() {
        return CapacidadeAtual;
    }
    
    public void setCapacidadeAtual(int value){
        if(value > this.CapacidadeTotal) {
            System.out.println("Carga excedida!");
            return;
        }
        this.CapacidadeAtual = value;
        
    }
}