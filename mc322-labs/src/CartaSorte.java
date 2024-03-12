import java.util.Random;

public class CartaSorte {

    private int id;
    private String descricao;
    private int movimento;
    private int efeito;
    private float valor;
    private String acao;
    private int tempo;
    private String restricao;
    
    public CartaSorte(String descricao, int movimento, int efeito, float valor, String acao, int tempo, String restricao){
        this.id = gerarID();
        this.descricao = descricao;
        this.movimento = movimento;
        this.efeito = efeito;
        this.valor = valor;
        this.acao = acao;
        this.tempo = tempo;
        this.restricao = restricao;
    }


    //getters e setters
    public int getId(){
        return this.id;
    }

    public void setId(){
        this.id = gerarID();
    }

    public String getDescricao(){
        return this.descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public int getMovimento(){
        return this.movimento;
    }

    public void setMovimento(int movimento){
        this.movimento = movimento;
    }

    public int getEfeito(){
        return this.efeito;
    }

    public void setEfeito(int efeito){
        this.efeito = efeito;
    }

    public float getValor(){
        return this.valor;
    }

    public void setValor(int valor){
        this.valor = valor;
    }

    public String getAcao(){
        return this.acao;
    }

    public void setAcao(String acao){
        this.acao = acao;
    }

    public int getTempo(){
        return this.tempo;
    }

    public void setTempo(int tempo){
        this.tempo = tempo;
    }

    public String getRestricao(){
        return this.restricao;
    }

    public void setRestricao(String restricao){
        this.restricao = restricao;
    }

    //criando ID randomico
	private int gerarID() {
		Random random = new Random();
		int newId = random.nextInt(100000000);
		return newId;
	}



}
