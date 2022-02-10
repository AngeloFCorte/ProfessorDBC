public class Elfo extends Personagem {    
    private int indiceFlecha = 0;
    private int indiceArco = 1;

    public Elfo(String nome){
        super( nome );
        super.vida = 100.0;
        super.qtdExperienciaPorAtaque = 2;
        inventario.adicionarItem(new Item("Flecha", 2));
        inventario.adicionarItem(new Item("Arco", 1));
        this.ativarOuDesativarItem(true, this.inventario.obter(1),1);
        this.ativarOuDesativarItem(true, this.inventario.obter(0),0);
    }
    
    public Item getFlecha(){
    return this.inventario.obter(indiceFlecha);
    }
    
    public Item getArco(){
    return this.inventario.obter(indiceArco);
    }
    
}
