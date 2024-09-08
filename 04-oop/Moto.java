public class Moto extends Veiculo{
    int cilindradas;
    
    public void PagarPedagio() {
        if(this.SemParar < 10) {
            System.out.printf("Carro sem dinheiro suficiente!\n");
            return;
        }
        this.SemParar -= 10;
        System.out.printf("Dinheiro: %.1f\n", this.SemParar);
    }
    
    public Moto(int ano, int chassi, float preco, float SemParar, int cilindradas) {
        super(ano, chassi, preco, SemParar);  
        this.cilindradas = cilindradas;
    }
    
    public int getCilindradas() {
        return cilindradas;
    }
    
    public void setCilindradas() {
        this.cilindradas = cilindradas;
    }
}