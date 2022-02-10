

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ElfoVerdeTest
{
    @Test
    public void elfoVerdeGanha2XpPorAtaque(){
        ElfoVerde elfo = new ElfoVerde("a");
        elfo.atacar(null);
        assertEquals ((Integer) 2, elfo.getExperiencia());
    }
    
    @Test
    public void adicionarItemComDescricaoValidaNoElfoVerde(){
        ElfoVerde elfo = new ElfoVerde("a");
        elfo.ganharItem(new Item("Arco de Vidro", 1));
        assertEquals((String)"Arco de Vidro", elfo.getInventario().obter(2).getDescricao());
    }
    
    @Test
    public void adicionarItemComDescricaoInvalidaNoElfoVerde(){
        ElfoVerde elfo = new ElfoVerde("a");
        elfo.ganharItem(new Item("Arco de Ferro", 1));   
        assertNull( elfo.inventario.obter(2));
    }
    
    @Test
    public void perderItemComDescricaoValidaNoElfoVerde(){
        ElfoVerde elfo = new ElfoVerde("a");
        elfo.ganharItem(new Item("Arco de Vidro", 1));
        assertEquals((String)"Arco de Vidro", elfo.getInventario().obter(2).getDescricao());
        elfo.perderItem(elfo.inventario.obter(2));
        assertNull(elfo.inventario.obter(2));
    }
    
    @Test
    public void perderItemComDescricaoInvalidaNoElfoVerde(){
    
    }
}
