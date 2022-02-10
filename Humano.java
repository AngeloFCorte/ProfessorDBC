public class Humano extends Personagem {
    
    public Humano(String nome){
        super(nome);
        super.vida = 110.0;
        super.qtdDano = 10.0;
        this.inventario.adicionarItem(new Item("Espada",1));
    
    
    }
    
}
