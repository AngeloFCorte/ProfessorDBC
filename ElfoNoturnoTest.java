import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ElfoNoturnoTest
{
    @Test
     public void elfoNoturnoGanha3XpPorAtaque(){
        ElfoNoturno elfo = new ElfoNoturno("a");
        elfo.atacar(null);
        assertEquals ((Integer) 3, elfo.getExperiencia());
    }
    
    @Test
    public void elfoNoturnosofre15DeDanoAtacar(){
        ElfoNoturno elfo = new ElfoNoturno("a");
        Anao anao = new Anao("b");
        elfo.atacarOutroPersonagem(anao,elfo.getFlecha());
        assertEquals((Double) 85.0, elfo.getVida()); 
    }
    
    @Test
    public void elfoNoturnoMorre7Ataques(){
        ElfoNoturno elfo = new ElfoNoturno("a");
        Anao anao = new Anao("b");
        elfo.atacarOutroPersonagem(anao, elfo.getFlecha());
        elfo.atacarOutroPersonagem(anao, elfo.getFlecha());
        elfo.atacarOutroPersonagem(anao, elfo.getFlecha());
        elfo.atacarOutroPersonagem(anao, elfo.getFlecha());
        elfo.atacarOutroPersonagem(anao, elfo.getFlecha());
        elfo.atacarOutroPersonagem(anao, elfo.getFlecha());
        elfo.atacarOutroPersonagem(anao, elfo.getFlecha());
        assertEquals((Double) 0.0, elfo.getVida()); 
        assertEquals(Status.MORTO,elfo.getStatus());
    }
}
