import java.util.InputMismatchException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Jogador {

    private String nome;
    private String cpf;
    private String email;
    private String foto;

    public Jogador(String nome, String cpf, String email, String foto){
        this.nome  = nome;


        //pensar melhor nesse tratamento
        if(validarCPF(cpf)){
            this.cpf = cpf;
        }
        else{
            System.out.println("O cpf informado não é válido");
            Scanner ler = new Scanner(System.in);
            System.out.printf("Informe um CPF válido:\n");
            cpf = ler.next();
        }
        
        this.email = email;
        this. foto = foto;
    }

    //getters e setters

    public String getNome () {
        return this.nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public String getCpf () {
        return this.cpf;
    }

    public void setCpf (String cpf) {
        this.cpf = cpf;
    }

    public String getEmail () {
        return this.email;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public String getFoto () {
        return this.foto;
    }

    public void setFoto (String foto) {
        this.foto = foto;
    }

    //toString
	@Override
	public String toString() {
		return "Nome: " + this.nome + "\nCPF: " + this.cpf + 
				"\nEmail: " + this.email + "\nFoto: " 
				+ this.foto;
				
	}

    //validar CPF
	private boolean validarCPF (String cpf) {
        cpf = cpf.replaceAll("[^0-9]", "");
		// verifica se há números iguais apenas no CPF
        if (cpf.equals("00000000000") ||
            cpf.equals("11111111111") ||
            cpf.equals("22222222222") || cpf.equals("33333333333") ||
            cpf.equals("44444444444") || cpf.equals("55555555555") ||
            cpf.equals("66666666666") || cpf.equals("77777777777") ||
            cpf.equals("88888888888") || cpf.equals("99999999999") ||
            (cpf.length() != 11))
            return(false);

        char dig10, dig11;
        int sm, i, r, num, peso;

        try {
        // Calculo do primeiro Digito Verificador
            sm = 0;
            peso = 10;
            for (i=0; i<9; i++) {
        // converte o i-esimo caractere do CPF em numero:
            num = (int)(cpf.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig10 = '0';
            else dig10 = (char)(r + 48); 

        // Calculo do segundo Digito Verificador
            sm = 0;
            peso = 11;
            for(i=0; i<10; i++) {
            num = (int)(cpf.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                 dig11 = '0';
            else dig11 = (char)(r + 48);

        // Verifica se digitos informados e calculados batem
            if ((dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10)))
                 return(true);
            else return(false);
                } catch (InputMismatchException erro) {
                return(false);
            }
	}

    //validar e-mail
    public static boolean validarEmail(String email) {
    boolean isEmailIdValid = false;
    if (email != null && email.length() > 0) {
        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            isEmailIdValid = true;
        }
    }
    return isEmailIdValid;
}


}
