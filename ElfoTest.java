import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ElfoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ElfoTest{
    @Test
    public void criarElfoeVerificarSeAumentouXp(){
        Elfo elfoAdulto = new Elfo("Elfo Adulto");
        elfoAdulto.atacar(elfoAdulto.inventario.obter(0));
        assertEquals((Integer)1, elfoAdulto.getExperiencia());
    }
    
    @Test
    public void verificarSeElfoNasceComDuasFlechas(){
        Elfo elfoAdulto = new Elfo("Elfo Adulto");
        assertEquals((Integer)2, elfoAdulto.getFlecha().getQuantidade());
    }
    
    @Test
    public void verificarSeElfoPerdeFlechaQuandoAtaca(){
        Elfo elfoAdulto = new Elfo("Elfo Adulto");
        elfoAdulto.atacar(elfoAdulto.inventario.obter(0));
        assertEquals((Integer)1, elfoAdulto.getFlecha().getQuantidade());
    }
   
    }

   
