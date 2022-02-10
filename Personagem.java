public abstract class Personagem{
    protected String nome;
    protected Integer experiencia;
    protected Integer qtdExperienciaPorAtaque;
    protected Inventario inventario;
    protected Status status;
    protected double vida;
    protected double qtdDano;
    protected Item[] maos;
    
    {
        this.inventario = new Inventario();
        this.experiencia = 0;
        this.status = Status.RECEM_CRIADO;
        this.qtdExperienciaPorAtaque = 1;
        this.qtdDano = 0.0;
        this.maos = new Item[2];
    }
    
    public Personagem(String nome){
        this.nome = nome;
            }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public Integer getExperiencia(){
        return this.experiencia;
    }
    
    public double getVida(){
        return this.vida;
    }
    
    public Status getStatus(){
        return this.status;
    }
    
    public Inventario getInventario(){
        return this.inventario;
    }
    
    public void ganharItem(Item item){
        inventario.adicionarItem(item);
    }
    
    public void perderItem(Item item){
        inventario.removerItem(item);
    }
    
    protected void aumentarXp(){
        this.experiencia += this.qtdExperienciaPorAtaque;
    }
    
    protected void ativarOuDesativarItem(boolean ativado, Item item ,int posicao){
        this.maos[posicao] = ativado ? item: null;
    }
    
    protected boolean itemEstaAtivado( Item item, int posicao){
        return this.maos[posicao].equals(item.getDescricao());
    }
    
    public boolean podeSofrerDano(){
        return this.vida > 0;
    }
    
    protected Status validacaoStatus(){
        if(this.vida > 0){
            return this.status = Status.SOFREU_DANO;
        }else{return this.status = Status.MORTO;}
        //this.vida == 0 ? Status.MORTO : Status.SOFREU_DANO;
    }
    
    public void sofrerDano(){
        if(podeSofrerDano()){    
            this.vida -= this.vida >= this.qtdDano ? this.qtdDano : this.vida;
            this.validacaoStatus();
        }
    }
    
    public void atacar (Item consumivel){
        if(consumivel != null){
            this.etapasConsumivel(consumivel);
        }else{
            this.aumentarXp();
            this.sofrerDano();
        }
    }
    
    public void atacarOutroPersonagem(Personagem personagem, Item consumivel){
        if(consumivel != null){
            this.etapasConsumivel(consumivel);
            personagem.sofrerDano();
            this.validacaoStatus();
        }else {
            this.aumentarXp();
            this.sofrerDano();
            personagem.sofrerDano();
            this.validacaoStatus();
        }
    }
    
    private void etapasConsumivel(Item consumivel){
        consumivel.diminuirQtd();
        this.aumentarXp();
        this.sofrerDano();
    }
}



