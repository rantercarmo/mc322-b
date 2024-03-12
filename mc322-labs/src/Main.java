
public class Main {
    public static void main(String[] args) {
		//inicializando objetos

    //ver se o construtor da classe carta foi reconhecido
        Peca p1 = new Peca("amarelo",10);
        Jogador j1 = new Jogador("Rafael","466.406.038-94","rafael.s@gmail.com","./documents/rafa.png");
       CartaSorte c1 = new CartaSorte("validador", 12, 34, 4,"perde tudo",12, "sair da casa 2");
       System.out.println(j1);

	}

}
