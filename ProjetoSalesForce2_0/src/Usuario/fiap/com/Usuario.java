package Usuario.fiap.com;

import java.util.Random;

import Conta.fiap.com.Conta;

public abstract class Usuario {
	private String nome;
	protected String email;
	private long cpf;
	private int id;

	// private String senha;
	// protected Conta conta;

	public Usuario() {

	}

	public Usuario(String nome, String email, long cpf) {
		this.id = gerarId();
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;

	}

	public int getId() {
		return id;
	}
	
	private int gerarId() {
        Random gerador = new Random();
        return gerador.nextInt(1000, 10000);
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", email=" + email + ", cpf=" + cpf + "]";
	}

}
