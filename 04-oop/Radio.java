public class Radio{
    String estacao;
    int canal;
    int volume;
    
    public Radio(String estacao) {
        switch(estacao) {
            case "AM":
                this.canal = 20;
                break;
            case "FM":
                this.canal = 80;
                break;
        }
    }
    
    public void AumentarVolume() {
        if(this.volume <= 90) {
            this.volume += 10;
            return;
        }
        this.volume = 100;
    }
    
    public void DiminuirVolume() {
        if(this.volume >= 10) {
            this.volume -= 10;
            return;
        }
        this.volume = 0;
    }
    
    public int getCanal() {
        return canal; 
    }
    
    public void setCanal(int value) {
        this.canal = value;
    }
    
    public int getVolume() {
        return volume;
    }
    
    public void setVolume(int value) {
        this.volume = value;
    }
}