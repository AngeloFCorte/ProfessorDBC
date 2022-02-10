public class Anao extends Personagem {
    public Anao (String nome){
        super(nome);
        super.vida = 110.0;
        super.qtdDano = 10.0;
        this.inventario.adicionarItem(new Item("escudo",1));
    }
    
    public void verificarEscudoSetarDano(){
        //se o escudo esta ativo na posicao 1
        //se estiver ativo colocar true no escudoEquipado
        //se nao estiver ativo, ativar
        super.qtdDano = this.itemEstaAtivado(this.inventario.obter(0), 1)? 5.0 : 10.0;
    }
}