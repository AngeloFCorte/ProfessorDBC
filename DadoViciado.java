import java.util.Random;
public class DadoViciado implements Sorteador{
    private int valorFalso;
    
    public void simularValor(int valor){
        this.valorFalso = valor;
    }
     
    public int sortear(){
        return this.valorFalso;
    }
    
}
