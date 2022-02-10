

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class InventarioTest{
    
    @Test
    public void criarInventarioSemPassarValor(){
    Inventario inventario = new Inventario();
    assertEquals (99, inventario.getItem().size(), 0.0);
    }
    
    @Test
    public void criarInventarioPassandoValor(){
    Inventario inventario = new Inventario();
    assertEquals (45, inventario.getItem().size(), 0.0);
    }
    
    @Test
    public void adicionar1ItemAoInventario(){
    Inventario inventario = new Inventario();
    Item item = new Item("faca", 1);
    inventario.adicionarItem(item);
    assertEquals (item , inventario.obter(0));
    }
    
    @Test
    public void adicionar2ItensAoInventario(){
    Inventario inventario = new Inventario();
    Item item = new Item("faca",1);
    Item item2 = new Item("escudo",1);
    inventario.adicionarItem(item);
    inventario.adicionarItem(item2);
    
    assertEquals (item, inventario.getItem().get(0));
    assertEquals (item2, inventario.getItem().get(1));
    }
    
    @Test
    public void obterUmItemNoInventario(){
    Inventario inventario = new Inventario();
    Item item = new Item("faca",1);
    Item item2 = new Item("escudo",1);
    inventario.adicionarItem(item);
    inventario.adicionarItem(item2);
    
    assertEquals (item, inventario.obter(0));
    assertEquals (item2, inventario.obter(1));
    }
    
    @Test
    public void removerUmItemNoInventario(){
    Inventario inventario = new Inventario();
    Item item = new Item("faca",1);
    Item item2 = new Item("escudo",1);
    inventario.adicionarItem(item);
    inventario.adicionarItem(item2);
    inventario.removerItem(item2);
    assertEquals (item, inventario.getItem().get(0));
    assertNull (inventario.obter(1));
    }
}
