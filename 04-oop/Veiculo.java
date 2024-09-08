public class Veiculo{
    private int ano;
    private int chassi;
    private float preco;
    private float quilometragem;
    private float SemParar;
    
    public void PagarPedagio(){
        //Este método será sobrescrito nas subclasses
    }
    
    public Veiculo(int ano, int chassi, float preco, float SemParar) {
        this.ano = ano;
        this.chassi = chassi;
        this.preco = preco;
        this.SemParar = SemParar;
    }
    
    public int getAno() {
        return this.ano;
    }
    
    public int getChassi() {
        return this.chassi;
    }
    
    public float getPreco() {
        return this.preco;
    }
    
    public float getSemParar() {
        return this.SemParar;
    }
    
    public void setAno(int value) {
        this.ano = ano;
    }
    
    public void setChassi(int value) {
        this.chassi = value;
    }
    
    public void setPreco(float value) {
        this.preco = value;
    }
    
    public void setSemParar(float value) {
        this.SemParar = value;
    }
    
}