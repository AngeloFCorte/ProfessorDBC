
/**
 * Write a description of class Orc here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Orc extends Personagem {
   
    public Orc(String nome){
        super(nome);
        super.vida = 110.0;
        this.inventario.adicionarItem(new Item("escudo",1));    
    }    
}

