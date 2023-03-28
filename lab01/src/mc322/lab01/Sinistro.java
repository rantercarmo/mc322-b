package mc322.lab01;
import java.util.UUID;
import java.util.Random;
import java.lang.*;

public class Sinistro {
	private int id;
	private String data;
	private String endereco;
	
	
	//construtor
	public Sinistro (String data, String endereco) {
		this.id = gerarID();
		this.data = data;
		this.endereco = endereco;
	}
	
	//getters e setters
	
	public int getID () {
		return id;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	//criando ID randomico
	private int gerarID() {
		Random random = new Random();
		int newId = random.nextInt(100000000);
		return newId;
	}
}
