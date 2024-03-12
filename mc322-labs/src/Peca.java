public class Peca {

    private String cor;
    private int posicao;

    //construtor
    public Peca(String cor, int posicao){
        this.cor = cor;
        this.posicao = posicao;
    }

    //getters
    public String getCor (){
        return this.cor;
    }

    public int getPosicao(){
        return this.posicao;
    }

    //setters

    public void setCor(String cor){
        this.cor = cor;
    }

    public void setPosicao(int posicao){
        this.posicao = posicao;
    }

}
