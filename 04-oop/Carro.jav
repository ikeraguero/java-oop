public class Carro extends Veiculo{
    Radio frequencia = new Radio("FM");
    Radio amplitude = new Radio("AM");
    boolean automatico;
    
    public void PagarPedagio() {
        if(this.SemParar < 20) {
            System.out.printf("Carro sem dinheiro suficiente!\n");
            return;
        }
        this.SemParar -= 20;
        System.out.printf("Dinheiro: %.1f\n", this.SemParar);
    }
    
    public Carro(int ano, int chassi, float preco, float SemParar, boolean automatico) {
        super(ano, chassi, preco, SemParar);
        this.automatico = automatico;
    }
    
    public void getAutomatico() {
        System.out.println(automatico);
    }
    
    public void setAutomatico(boolean value) {
        this.automatico = value;
    }
}