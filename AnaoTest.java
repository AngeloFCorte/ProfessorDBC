

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AnaoTest{
    
    @Test
    public void anaoDeveNascerCom110Hp(){
        Anao anaoAdulto = new Anao("AnaoAdulto");
        
        assertEquals ((Double)110.0,anaoAdulto.getVida(), 0.0001);
    }
    
    @Test
    public void anaoRecebeAtaqueEFicaCom100DeHp(){
        Anao anaoAdulto = new Anao("AnaoAdulto");
        anaoAdulto.sofrerDano();
        assertEquals ((Double)100.0,anaoAdulto.getVida(), 0.0001);
    }
    
    @Test
    public void anaoRecebe11AtaquesEZeraVida(){
        Anao anaoAdulto = new Anao("AnaoAdulto");
        for(int i = 0; i < 11; i++){ 
        anaoAdulto.sofrerDano();
        }
        assertEquals ((Double)0.0,anaoAdulto.getVida(), 0.0001);
    }
}
