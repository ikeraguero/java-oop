public class Moto extends Veiculo{
    private int cilindradas;
    
    public void PagarPedagio() {
        if(this.getSemParar() < 10) {
            System.out.printf("Carro sem dinheiro suficiente!\n");
            return;
        }
        this.setSemParar(this.getSemParar()-10);
        System.out.printf("Dinheiro: %.1f\n", this.getSemParar());
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