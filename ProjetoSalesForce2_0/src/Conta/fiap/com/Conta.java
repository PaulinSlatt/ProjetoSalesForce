package Conta.fiap.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import Usuario.fiap.com.Usuario;

public class Conta {
    private String email;
    protected String senha;
    private int id;
    private static List<Usuario> clientes = new ArrayList<Usuario>(); // ArrayList para armazenar os clientes

   public Conta() {
	   
   }
    
    public Conta(String email, String senha) {
        this.email = email;
        this.senha = senha;
        this.id = new Random().nextInt(1000, 10000);
        
    }

    public String getEmail() {
    	return email;
    }
    
    public  String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

	public int getId() {
		return this.id;
	}

    public List<Usuario> getClientes() {
        return clientes;
    }

    public static void adicionarCliente(Usuario cliente) {
        clientes.add(cliente);
    }

    public static void removerCliente(Usuario cliente) {
        clientes.remove(cliente);
    }

    public static Usuario buscarClientePorEmail(String email) {
        for (Usuario cliente : clientes) {
            if (cliente.getEmail().equals(email)) {
                return cliente;
            }
        }
        return null; // Cliente não encontrado
    }

    public static String getInformacoesClientes() {
        StringBuilder info = new StringBuilder("Informações dos Clientes:\n");
        for (Usuario cliente : clientes) {

        	info.append("Id: ").append(cliente.getId()).append("\n");
        	info.append("Nome: ").append(cliente.getNome()).append("\n");
            info.append("CPF: ").append(cliente.getCpf()).append("\n");
            info.append("Email: ").append(cliente.getEmail()).append("\n");
            info.append("\n");
        }
        return info.toString();
    }


   

    public boolean login(String senha, String email) {
        for (Usuario cliente : clientes) {
            if (cliente.getEmail().equals(email) && senha.equals(senha)) {
                return true;
            }
        }
        return false;
    }
}
